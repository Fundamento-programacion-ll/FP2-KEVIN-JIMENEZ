/*var nombre = "kevin"


var b = ''
var tn = nombre.length


while (tn >= 0) {
    b += nombre.charAt(tn)
    console.log(b)
    tn--
}
*/
/*
Primera palabra mayuscula, inicio mitad final
contar cuantos ; o , o .
espacion con *-*
*/
/*
var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).'
*/

var nombre = 'kevin asdasda';
var b = "";
var tamanioLetra = nombre.length
console.log(nombre.length);
console.log(nombre.indexOf("v"));

function validateEmail(email) {
    var re = 
    /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

//console.log(validateEmail('sdadasdsadad@'));
console.log(nombre.search("in"));

console.log(nombre.substr(2));

console.log(nombre.charAt(3));

while (tamanioLetra >= 0) {
    b += nombre.charAt(tamanioLetra)
    console.log(b)
    tamanioLetra--
}
console.log(nombre.slice(1,-8))
console.log(nombre.split(" "))

var texto = "hola que hace"
console.log('Antes de remplazar')
console.log(texto);
console.log('Despues de remplazar')
var textModificado = texto.replace('que hace','khe')
console.log(textModificado);

var ejemploTrim = "hola"
console.log(ejemploTrim)
console.log(ejemploTrim.trim())

console.log(ejemploTrim.concat(" ",nombre));
console.log(ejemploTrim.toLowerCase());
ejemploTrim === nombre;


















