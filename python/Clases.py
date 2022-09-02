
class vehiculo:
    Color = "Negro"
    Ruedas = 4
    Puertas = 4

class coche(vehiculo):
    velocidad = 120
    cilindrada = 500

Toyota_Corolla = coche()

print(Toyota_Corolla.cilindrada)
print(Toyota_Corolla.Ruedas)
