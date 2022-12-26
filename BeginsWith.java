public class BeginsWith implements IsGood<String> {
private String control;
    public BeginsWith(String control) {
    this.control = control;
}
    @Override
    public boolean isGood(String item) {
        String subStr = item.substring(0, control.length());
        return control.equals(subStr);
    }
    
}
