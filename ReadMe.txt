Programación Funcional y 
Reactiva 
Mini-Proyecto Primer Bimestre 
En la semana 3 desarrolló una solución para calcular un valor aproximado de una integral 
definida utilizando el método de Simpson 1/3. Sólo para recordar aquí se muestra dicho 
método.
Pero, es únicamente una aproximación y como tal tiene errores, que en algunos casos 
son inaceptables, es por ello que existen variantes del método anteriormente 
mencionado que buscan mejorar su precisión. A continuación se presentan dos de esas 
variantes.
Simpson 1/3 compuesta
En donde,
 es el número de sub intervalos con los que se desea trabajar. Este dato es ingresado 
por el usuario o definido por ustedes en su programa.
OJO   que esta aproximación únicamente funciona cuando el n es par. Para mayores 
detalles revisar: https://www.freecodecamp.org/espanol/news/la-regla-de-simpson-laformula-y-como-funciona/
I = ∫
b
a
f(x)d x ≅ (b − a) f(a) + 4f(x¯) + f(b)
6
x¯ = (a + b)
2
I = ∫
b
a
f(x)d x ≅
h
3
n/2
∑
j=1
(f(x2j−2) + 4f(x2j−1) + f(x2j
)
)
xj = a + jh
h = (b − a)
n
n
Simpson 1/3 extendida.
En donde,
,
 es impar
 es par
Para mayor referencia sobre la variante, lo invito a consultar el libro (disponible biblioteca 
física UTPL):
Shoischiro, N. (1992). Métodos numéricos aplicados con Software. Prentice Hall.
Una recomendación final, en la medida de su disponibilidad de tiempo consulte sobre el 
tema rangos en Scala, de seguro le ayudará mucho.
Actividades a realizar
1. Crear un repositorio en GitHub en donde ubicará su proyecto, en el mismo debe 
agregarme como uno de sus colaboradores (usuario en GiHub: jorgaf). Se tomará en 
cuenta el número de commits realizados como criterio de calificación. La idea es que 
avance de forma progresiva en el desarrollo de su proyecto. La creación del 
repositorio se debe hacer hasta el 2 de noviembre y enviar el link a mi correo.
2. Construir un programa en Scala (worksheet) para implementar cada una de las 2 
variaciones del método de Simpson.
3. Complete la tabla que se muestra a continuación, en cada celda vacía debe ubicar el 
error calculado. Esta tabla debe estar en la Wiki de su proyecto. Para la segunda 
columna puede usar los valores que calculó en el taller desarrollado en la semana 3. 
Si necesita mayor precisión, en el valor esperado, puede usar: https://
www.wolframalpha.com/
I = ∫
b
a
f(x)d x ≅
h
3 f(a) + 4
n−1
∑
i=1
f(a + ih) + 2
n−2
∑
j=2
f(a + jh) + f(b)
h = b − a
n
n = 2 * (b − a)
i
j
f(x) Simpson 1/3 Simpson 
compuesta
Simpson 
extendida
Valor 
esperado
7,33
f(x)
I = ∫
5
3
(−x2 + 8x − 12)d x
4. Las fechas son las siguientes:
1. Fecha máxima de entrega (último commit a revisar): miércoles 16 de noviembre 
de 2022 hasta las 23:59. 
2. Fecha de presentación: Jueves 17 de noviembre hasta las 17:50.
Cualquier duda, la pueden plantear en los horarios de tutoría o en la oficina (únicamente 
en las mañanas) o por mensajería de Canvas.