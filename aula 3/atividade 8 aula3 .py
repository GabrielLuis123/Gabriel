dados_cliente = {
    "Nome": "Diemes",
    "Endereco": "Rua ABC, 123",
    "Telefone": "988179995"
}

print (dados_cliente['Nome'])

dados_cliente["Cidade"] = "Ivaporã" #Insere um item
print(dados_cliente)

dados_cliente.pop("Telefone") #Remove Item

for indice, valor in dados_cliente.items():
    print(f"Indice: {indice}, valor: {valor}")
    print("----------------------------------------------")