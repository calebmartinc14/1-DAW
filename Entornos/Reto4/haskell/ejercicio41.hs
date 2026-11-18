main :: IO ()
main = do
  putStr "¿Tiene carnet de conducir? (s/n): "
  carnet <- getLine
  putStr "¿Cuántos puntos tiene?: "
  entradaPuntos <- getLine
  putStr "Tasa de alcoholemia en mg/l (use punto decimal): "
  entradaAlcohol <- getLine
  putStrLn "1. Móvil: 6 puntos, 200 EUR"
  putStrLn "2. Cinturón: 4 puntos, 200 EUR"
  putStrLn "3. Semáforo rojo: 4 puntos, 200 EUR"
  putStrLn "4. Sentido contrario: 6 puntos, 500 EUR"
  putStrLn "5. Conducción temeraria: 6 puntos, 500 EUR"
  putStrLn "6. Señales de los agentes: 4 puntos, 200 EUR"
  putStr "Elija la infracción (1-6): "
  entradaInfraccion <- getLine
  let puntosActuales = read entradaPuntos :: Int
      alcohol = read entradaAlcohol :: Double
      infraccion = read entradaInfraccion :: Int
  if infraccion < 1 || infraccion > 6
    then putStrLn "Infracción no válida."
    else do
      let puntosBase = if infraccion == 1 then 6
                       else if infraccion == 2 || infraccion == 3 || infraccion == 6 then 4
                       else 6
          multaBase = if infraccion == 1 then 200
                      else if infraccion == 2 || infraccion == 3 || infraccion == 6 then 200
                      else 500
          puntosCarnet = puntosBase
          multaCarnet = if carnet == "n" || carnet == "N" then multaBase + 100 else multaBase
          puntosAlcohol = if alcohol > 0.5 then 6
                          else if alcohol >= 0.25 then 4
                          else 0
          multaAlcohol = if alcohol > 0.5 then 1000
                         else if alcohol >= 0.25 then 500
                         else 0
      putStrLn ("Puntos que tenía: " ++ show puntosActuales)
      putStrLn ("Puntos retirados: " ++ show (puntosCarnet + puntosAlcohol))
      putStrLn ("Multa total: " ++ show (multaCarnet + multaAlcohol) ++ " EUR")
