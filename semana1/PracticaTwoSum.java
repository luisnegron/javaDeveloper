public class PracticaTwoSum {

    // LeetCode te entrega YA armado el frame "class Solution { ... }".
    // Tu trabajo es SOLO rellenar el cuerpo de este metodo.
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                //System.out.println("i=" + i + "j=" + j + " -> " + nums[i] + " + " + nums[j]);
                int suma = nums[i] + nums[j];
                if(suma == target){
                    /*System.out.println("target = " + target);
                    System.out.println("Encontrados los indices i=" + i + " y j=" + j);*/
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { };
    }

    public static void main(String[] args) {
        PracticaTwoSum sol = new PracticaTwoSum();

        // Mismo ejemplo que LeetCode (asegurate de imprimir [0, 1] cuando este listo)
        int[] resultado = sol.twoSum(new int[] { 2, 7, 11, 15 }, 9);

        if (resultado.length >= 2) {
            System.out.println("Resultado: [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("Resultado: aun vacio -> primero el PASO 1");
        }
    }
}
