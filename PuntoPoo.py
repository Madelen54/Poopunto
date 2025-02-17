import math
class Punto:
    def __init__(self, x=0 ,y=0):
        self.x=x
        self.y=y
    def getX(self):
        return self.x
    def getY(self):
        return self.y
    def cordenadasPolares(self):
        r=math.sqrt(self.x**2+self.y**2)
        t=math.atan2(self.y,self.x)
        return r,t
    def __str__(self):
        r,t=self.cordenadasPolares()
        return f'cordenadas cartesianas:x=({self.x},y={self.y}),cordenadas polares:(r={r:.2f},0={t:.3f})'
x1,y1=map(float,input("ingrese los puntos ").split())

p1=Punto(x1,y1)
print(p1)