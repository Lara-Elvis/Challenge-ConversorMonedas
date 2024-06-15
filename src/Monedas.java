public record Monedas(String base_code,
                      String target_code,
                      double conversion_rate,
                      double conversion_result){

    static Principal principal = new Principal();

    @Override
    public String toString() {
        return  base_code + Principal.cantidad + " a " + target_code + " Son: " + conversion_result;
    }
}
