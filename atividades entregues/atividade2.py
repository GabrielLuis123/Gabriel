nome = input("Digite seu nome? ")
altura = float(input("Digite sua altura? "))
peso = float(input("Digite o seu peso? "))

imc=peso/ altura *2

print("Digite o seu nome",nome)
print("Digite a sua altura",altura)
print("Digite o seu peso",peso)
print(f"Seu imc é {imc:.1f}")