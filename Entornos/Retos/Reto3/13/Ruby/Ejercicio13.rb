# Se pide un programa que al introducir una cantidad de euros
# muestre su conversión a otras monedas.
tasa1 = 1.42
tasa2 = 0.8713
tasa3 = 113.86
tasa4 = 166.386

puts "¿Qué cantidad de euros quieres convertir?"
euro = gets.to_f

puts "La traducción de moneda es"
puts "En dólar: #{euro} euros son #{euro * tasa1} dólares"
puts "En libras: #{euro} euros son #{euro * tasa2} libras"
puts "En yenes: #{euro} euros son #{euro * tasa3} yenes"
puts "En pesetas: #{euro} euros son #{euro * tasa4} pesetas"
