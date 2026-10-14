IDENTIFICATION DIVISION.
PROGRAM-ID. EJERCICIO39.

DATA DIVISION.
WORKING-STORAGE SECTION.
01 PRECIO             PIC 9(5)V99.
01 METODO             PIC X(10).
01 PIN                PIC X(4).
01 TELEFONO           PIC X(15).
01 ENTREGADO          PIC 9(5)V99.
01 DIFERENCIA         PIC 9(5)V99.

PROCEDURE DIVISION.
    DISPLAY "Introduzca el precio del artículo:"
    ACCEPT PRECIO

    IF PRECIO < 0
        DISPLAY "El precio no puede ser negativo."
    ELSE
        DISPLAY "¿Cómo va a pagar? (efectivo, tarjeta o Bizum):"
        ACCEPT METODO

        IF METODO = "tarjeta"
            DISPLAY "Introduzca su PIN:"
            ACCEPT PIN
            DISPLAY "Pago con tarjeta realizado. Cantidad cobrada: "
                PRECIO " EUR"
        ELSE
            IF METODO = "bizum"
                DISPLAY "Introduzca su número de teléfono:"
                ACCEPT TELEFONO
                DISPLAY "Bizum enviado al número " TELEFONO
                    ". Cantidad cobrada: " PRECIO " EUR"
            ELSE
                IF METODO = "efectivo"
                    DISPLAY "¿Cuánto dinero entrega?"
                    ACCEPT ENTREGADO

                    IF ENTREGADO = PRECIO
                        DISPLAY "Ha pagado el precio exacto."
                    ELSE
                        IF ENTREGADO > PRECIO
                            COMPUTE DIFERENCIA =
                                ENTREGADO - PRECIO
                            DISPLAY "Su cambio es: "
                                DIFERENCIA " EUR"
                        ELSE
                            COMPUTE DIFERENCIA =
                                PRECIO - ENTREGADO
                            DISPLAY "Le falta por pagar: "
                                DIFERENCIA " EUR"
                        END-IF
                    END-IF
                ELSE
                    DISPLAY "Método de pago no válido."
                END-IF
            END-IF
        END-IF
    END-IF

    STOP RUN.
