def numeros_pares(limite):
    pares = []
    for i in range(2, limite + 1, 2):
        pares.append(i)
    return pares

# Chamada da função e uso da lista retornada
limite = 10
lista_de_pares = numeros_pares(limite)
print(f"Números pares até {limite}: {lista_de_pares}")