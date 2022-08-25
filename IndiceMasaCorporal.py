print("Vamos a calcular tu indice de masa corporal")
print("   ")
print("Primero escribe tu peso en kilos")

peso = int(input())

print("Ahora introduce tu estatura en metros")

estatura= float(input())

imc = (peso/(estatura**2))

print("  ")
print("Tu índice de masa corporal es: ")
print(round (imc,2))

input()
