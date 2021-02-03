def f(x):
 return (x*3) + (1.71 * (x*2)) - (26.21*x) - 44.82


def bisection_method(function,start,end,iterations):
    x1 = start
    x2 = end
    midpoint = (x1+x2)/2


    for i in range(0,iterations):
        f1 = function(x1)
        f2 = function(x2)
        fm = function(midpoint)
        print("Iteración ",i+1)
        print("Intervalo: (",x1,",",x2,")"," Punto medio: ",midpoint)
        print("f(x) en el intervalo: Izquierda ",f1, " Centro ",fm," Derecha ",f2)


        if(fm==0):
            return midpoint
        else:
            if (f1*fm)<0 :
                print("Elijo el intervalo izquierdo ‹(ᵒᴥᵒ<)\n")
                x2 = midpoint
            else:
                print("Elijo el intervalo derecho (>ᵒᴥᵒ)>\n")
                x1 = midpoint

            midpoint = (x1+x2)/2

    return midpoint

x = bisection_method(f,4.0,6.0,30)
print("La raiz x esta en: ",x)
print("f(x)=",f(x))
