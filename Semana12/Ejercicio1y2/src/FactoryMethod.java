public class FactoryMethod {
    public static Object createObject(String parameter) throws MyCheckedException {
        if (parameter == null || parameter.isEmpty()) {
            
            throw new MyCheckedException("\u001b[30mEl parámetro proporcionado no es válido\u001b[31m");
        }

        return new Object();
    }
}

