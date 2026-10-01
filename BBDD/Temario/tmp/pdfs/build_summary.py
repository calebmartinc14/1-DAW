from reportlab.lib import colors
from reportlab.lib.enums import TA_CENTER
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import getSampleStyleSheet, ParagraphStyle
from reportlab.lib.units import mm
from reportlab.platypus import SimpleDocTemplate, Paragraph, Spacer, Table, TableStyle, KeepTogether, PageBreak
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.pdfbase import pdfmetrics
from reportlab.lib.colors import HexColor

out = 'output/pdf/Unit-1-Information-Storage-Study-Summary.pdf'
navy = HexColor('#17324D'); blue = HexColor('#246A8D'); pale = HexColor('#EAF2F6'); ink = HexColor('#24323D')
styles = getSampleStyleSheet()
styles.add(ParagraphStyle(name='TitleX', parent=styles['Title'], fontName='Helvetica-Bold', fontSize=21, leading=25, textColor=navy, alignment=TA_CENTER, spaceAfter=4))
styles.add(ParagraphStyle(name='SubX', parent=styles['Normal'], fontSize=9, leading=12, textColor=blue, alignment=TA_CENTER, spaceAfter=12))
styles.add(ParagraphStyle(name='HeadX', parent=styles['Heading2'], fontName='Helvetica-Bold', fontSize=12, leading=15, textColor=navy, spaceBefore=7, spaceAfter=4, keepWithNext=True))
styles.add(ParagraphStyle(name='BodyX', parent=styles['BodyText'], fontSize=9, leading=12, textColor=ink, spaceAfter=4))
styles.add(ParagraphStyle(name='SmallX', parent=styles['BodyText'], fontSize=8.2, leading=10.5, textColor=ink, spaceAfter=2))
styles.add(ParagraphStyle(name='CallX', parent=styles['BodyText'], fontSize=9, leading=12, textColor=navy, backColor=pale, borderPadding=7, spaceBefore=4, spaceAfter=6))

def P(t, style='BodyX'): return Paragraph(t, styles[style])
def bullets(items): return [P('&bull; '+x, 'BodyX') for x in items]
def section(title, items): return [P(title, 'HeadX')] + bullets(items)
def footer(canvas, doc):
    canvas.saveState(); canvas.setStrokeColor(HexColor('#D7E1E8')); canvas.line(18*mm, 14*mm, 192*mm, 14*mm)
    canvas.setFont('Helvetica', 8); canvas.setFillColor(HexColor('#607482'))
    canvas.drawString(18*mm, 9*mm, 'DATABASES | UNIT 1 - STUDY SUMMARY')
    canvas.drawRightString(192*mm, 9*mm, f'{doc.page}')
    canvas.restoreState()

story = [P('UNIT 1: INFORMATION STORAGE', 'TitleX'), P('Concise study summary | Key terms shown in English and Spanish', 'SubX'),
P('1. Files and file organization (ficheros)', 'HeadX'),
P('<b>Data file:</b> related, structured records stored under a name. A record (registro) describes one item; fields (campos) hold its individual facts. A <b>key</b> (clave) identifies a record. A physical block transfers several logical records between storage and memory.', 'BodyX'),
P('<b>File types:</b> permanent files are master (maestro/current data), constant (constante/rarely changed reference data), or historical (histórico/past states). Temporary files include intermediate, work, and output/results files.', 'BodyX'),
P('<b>Storage:</b> sequential media (e.g. magnetic tape) must be read in order; direct-access media (e.g. disks/SSD) can address data directly. Choose file organization based on size, query/update activity, turnover, and growth.', 'BodyX')]
rows = [[P('<b>Organization</b>','SmallX'),P('<b>How it works / trade-off</b>','SmallX')],
[P('Sequential','SmallX'),P('Records stored in order; simple and space-efficient, but searches/updates are slow and inserts belong at the end.','SmallX')],
[P('Linked sequential','SmallX'),P('Pointers link records; flexible insert/delete, but traversal remains sequential.','SmallX')],
[P('Indexed sequential','SmallX'),P('Index maps keys to data blocks; supports sequential and direct lookup, at the cost of extra index space.','SmallX')],
[P('Direct / random','SmallX'),P('Key or hash computes/finds record location; fast access and in-place updates, but needs direct-access storage and collision handling.','SmallX')]]
t=Table(rows,colWidths=[36*mm,138*mm],repeatRows=1)
t.setStyle(TableStyle([('BACKGROUND',(0,0),(-1,0),navy),('TEXTCOLOR',(0,0),(-1,0),colors.white),('GRID',(0,0),(-1,-1),.35,HexColor('#CAD7DF')),('VALIGN',(0,0),(-1,-1),'TOP'),('ROWBACKGROUNDS',(0,1),(-1,-1),[colors.white,pale]),('LEFTPADDING',(0,0),(-1,-1),6),('RIGHTPADDING',(0,0),(-1,-1),6),('TOPPADDING',(0,0),(-1,-1),5),('BOTTOMPADDING',(0,0),(-1,-1),5)])); story += [t,
P('<b>Why move beyond files?</b> Separate files often cause duplicated or inconsistent data, isolated information, program-data dependence, difficult ad-hoc queries and concurrency, and weak integrity/security controls.','CallX'),
P('2. Databases and DBMS (BD y SGBD)', 'HeadX'),
P('A <b>database (BD)</b> is an organized collection of related data. A <b>DBMS (SGBD)</b> is the software that defines, stores, queries, updates, secures, and controls access to it. It helps reduce redundancy, enforce integrity, share data concurrently, and separate data from applications. It also manages recovery, transactions, permissions, and metadata.', 'BodyX'),
P('<b>Models:</b> hierarchical = tree/parent-child; network = linked records/many connections; relational = tables linked by keys (most common foundation); object-oriented = objects/classes; document = flexible JSON/XML-like documents. Other models include object-relational, deductive, multidimensional (analysis), and transactional (operations).', 'BodyX'),
P('<b>ANSI/SPARC architecture:</b> external views (what each user sees), conceptual schema (the overall logical design), and internal schema (physical storage). This separation supports data independence. DBMS examples: commercial Oracle, SQL Server, DB2; open source MySQL Community, MariaDB, PostgreSQL, SQLite.', 'BodyX'),
P('<b>Where data lives:</b> disks for direct access; tape for sequential backup; RAID combines disks for performance and/or fault tolerance; network storage is shared across systems; cloud storage is hosted remotely and accessed over a network.', 'BodyX'),
P('3. Centralized and distributed databases', 'HeadX'),
P('<b>Centralized:</b> data and DBMS run in one location. Easier to administer and keep consistent, but a central failure can stop service and capacity is limited to that system. <b>Distributed:</b> logically related databases live on networked nodes; a distributed DBMS aims to make them appear as one system. It can improve locality, speed, availability, and scaling, but adds coordination, security, consistency, and recovery complexity.', 'BodyX'),
P('<b>Fragmentation:</b> horizontal divides rows; vertical divides columns (keep the key in each fragment); hybrid combines both. Correct fragmentation must preserve all data (completeness), allow reconstruction, and avoid unnecessary duplication (disjointness, with keys repeated as needed).', 'BodyX'),
PageBreak(), P('4. Personal data and privacy (RGPD / LOPDGDD)', 'HeadX'),
P('Personal data identifies or can identify a living person. Sensitive categories include health, genetic/biometric, political, religious, union, and sexual-life data. The <b>GDPR (RGPD)</b> sets EU rules; Spain’s <b>LOPDGDD</b> complements it and covers digital rights. Core principles: lawful, fair, transparent use; specific purpose; collect only what is needed; accuracy; limited retention; security/confidentiality; and accountability.', 'BodyX'),
P('<b>People’s rights:</b> access, rectification, erasure (“right to be forgotten”), restriction, portability, objection, and safeguards around solely automated decisions. Organizations must use a valid legal basis, protect data, document processing, manage breaches, and appoint a DPO when required. Remember: the course highlights breach notice within 72 hours to the supervisory authority when required.', 'BodyX'),
P('<b>Exam cue:</b> collect the minimum data for a clear purpose, keep it accurate and only as long as needed, restrict access, and be able to demonstrate compliance.', 'CallX'),
P('5. Big Data and Business Intelligence', 'HeadX'),
P('<b>Big Data</b> handles datasets too large or complex for conventional tools. Its 5 Vs are <b>Volume</b> (amount), <b>Velocity</b> (generation/processing speed), <b>Variety</b> (formats), <b>Veracity</b> (quality), and <b>Value</b> (usefulness). Data may be <b>structured</b> (tables), <b>semi-structured</b> (JSON/XML), or <b>unstructured</b> (text, images, audio/video). Distributed tools and NoSQL systems help store/process it.', 'BodyX'),
P('<b>Analytics ladder:</b> descriptive = what happened; diagnostic = why; predictive = what may happen; prescriptive = what action to take. Typical workflow: collect, store, clean, explore, model, interpret, communicate.', 'BodyX'),
P('<b>Business Intelligence (BI)</b> applies data analysis to business decisions. ETL extracts, transforms, and loads data into a data warehouse; BI tools turn it into reports/dashboards. Goal: clearer decisions and more efficient operations. Data quality, integration, security, and scale are common challenges.', 'BodyX'),
P('Remember the big picture: <b>files store data; databases organize shared data; a DBMS manages it; analytics turns it into decisions.</b>', 'CallX')]

doc=SimpleDocTemplate(out,pagesize=A4,rightMargin=18*mm,leftMargin=18*mm,topMargin=15*mm,bottomMargin=19*mm,title='Unit 1: Information Storage - Study Summary',author='Study summary')
doc.build(story,onFirstPage=footer,onLaterPages=footer)
print(out)
