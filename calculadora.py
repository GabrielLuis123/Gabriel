sair = "sair"

numero1 = input("Digite o primeiro numero ")
numero2 = input("Digite o segundo numero ")
operador = input("Digite o operador(+-/*) ")


numero01_float = 0
numero02_float = 0
numero01_float = float(numero1)
numero02_float = float(numero2)

if operador == "+":
   print(f"(numero01_float) + (numero02_float) = ", numero02_float + numero01_float)

if operador == "-":
   print(f"(numero01_float) - (numero02_float) = ", numero02_float - numero01_float)

if operador == "/":
   print(f"(numero01_float) / (numero02_float) = ", numero02_float / numero01_float)

if operador == "*":
  print(f"(numero01_float) * (numero02_float) = ", numero02_float * numero01_float) 