NUMERO = 28590

puts "Introduzca un número entero"
numero_introducido = gets.to_i

if numero_introducido != 0 && NUMERO % numero_introducido == 0
  puts "#{numero_introducido} es un factor de #{NUMERO}"
else
  puts "#{numero_introducido} no es un factor de #{NUMERO}"
end
