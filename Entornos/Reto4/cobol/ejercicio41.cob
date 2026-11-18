       IDENTIFICATION DIVISION.
       PROGRAM-ID. EJERCICIO41.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 CARNET PIC X.
       01 PUNTOS-ACTUALES PIC 99 VALUE 0.
       01 ALCOHOL PIC 9.99 VALUE 0.
       01 INFRACCION PIC 9 VALUE 0.
       01 PUNTOS-RETIRADOS PIC 99 VALUE 0.
       01 MULTA PIC 9(5) VALUE 0.
       PROCEDURE DIVISION.
           DISPLAY "¿Tiene carnet de conducir? (s/n): "
           ACCEPT CARNET
           DISPLAY "¿Cuántos puntos tiene?: "
           ACCEPT PUNTOS-ACTUALES
           DISPLAY "Tasa de alcoholemia en mg/l (use punto decimal): "
           ACCEPT ALCOHOL
           DISPLAY "1. Móvil (6 puntos, 200 EUR)"
           DISPLAY "2. Cinturón (4 puntos, 200 EUR)"
           DISPLAY "3. Semáforo (4 puntos, 200 EUR)"
           DISPLAY "4. Sentido contrario (6 puntos, 500 EUR)"
           DISPLAY "5. Temeraria (6 puntos, 500 EUR)"
           DISPLAY "6. Señales agentes (4 puntos, 200 EUR)"
           DISPLAY "Elija la infracción (1-6): "
           ACCEPT INFRACCION
           IF INFRACCION = 1
             MOVE 6 TO PUNTOS-RETIRADOS
             MOVE 200 TO MULTA
           ELSE
             IF INFRACCION = 2 OR INFRACCION = 3 OR INFRACCION = 6
               MOVE 4 TO PUNTOS-RETIRADOS
               MOVE 200 TO MULTA
             ELSE
               IF INFRACCION = 4 OR INFRACCION = 5
                 MOVE 6 TO PUNTOS-RETIRADOS
                 MOVE 500 TO MULTA
               ELSE
                 DISPLAY "Infracción no válida."
                 STOP RUN
               END-IF
             END-IF
           END-IF
           IF CARNET = "n" OR CARNET = "N"
             ADD 100 TO MULTA
           END-IF
           IF ALCOHOL > 0.50
             ADD 6 TO PUNTOS-RETIRADOS
             ADD 1000 TO MULTA
           ELSE
             IF ALCOHOL >= 0.25
               ADD 4 TO PUNTOS-RETIRADOS
               ADD 500 TO MULTA
             END-IF
           END-IF
           DISPLAY "Puntos que tenía: " PUNTOS-ACTUALES
           DISPLAY "Puntos retirados: " PUNTOS-RETIRADOS
           DISPLAY "Multa total: " MULTA " EUR"
           STOP RUN.
