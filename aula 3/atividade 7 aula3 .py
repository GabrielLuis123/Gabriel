lista1 = ['Diemes', 'Nunes', 'Souza', 'Caio', 'Luana']
print(type(lista1))
print(len(lista1))
print(lista1[4])


lista2 = lista1 *2

print(lista2)

lista1.append("Amanda") #Adiciona mais um nome na lista
print(lista1)

lista1.remove("Caio") #Remove o nome da lista
print(lista1)

lista1.pop(3) #remove tambem
print(lista1)

for listageral in lista1:
    print(listageral)