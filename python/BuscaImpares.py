numeros_impares: [int] = []

print("Vamos a calcular los numeros impares en un rango de números")
print("   ")
print("Introduce un número")

numero_inicial = int(input())
print("   ")

print("Introduce otro número")
numero_final = int(input())
print("   ")

while numero_final <= numero_inicial:
    print("Introduce un numero mas grande")
    numero_final = int(input())


## Recorre cada número del rango dividiendolo entre 2
## En el caso de que el resto sea diferente de 0 se guarda el número en la lista numeros_impares
lista_numeros = range(numero_inicial, numero_final+1)
for x in lista_numeros:
    if(x % 2 !=0):
        numeros_impares.append(x)

print(numeros_impares)

input()


