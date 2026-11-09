public class EjemploMain {

    public static void main(String[] args) {

        // 1) CREAR el objeto: "new" = instanciar = fabricar la galleta del molde
        CuentaBancaria cuenta = new CuentaBancaria("Luis", 1000.0);

        // 2) USAR el objeto: llamar a sus metodos (las recetas)
        cuenta.ingresar(500.0);
        boolean pudoRetirar = cuenta.retirar(200.0);

        // 3) RECUPERAR valores con getters
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo tras operaciones: " + cuenta.getSaldo() + " €");
        System.out.println("¿Retiro autorizado?: " + pudoRetirar);

        // 4) Imprimir el objeto DIRECTAMENTE -> Java llama solo a toString()
        System.out.println(cuenta);

        // Intenta descomentar la linea siguiente y compila: veras el error del compilador
        // System.out.println(cuenta.saldo);
    }
}
