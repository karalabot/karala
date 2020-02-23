    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Locale;
    public class TurkishCharacterToUrl
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader =
                       new BufferedReader(new InputStreamReader(System.in));
	   Locale locale = new Locale("tr");

           String kelime = reader.readLine().toLowerCase(locale);

            var quote = "\"";

            String[][] replacements = {
                {"ç", "c"},
                {"ğ", "g"},
                {"ı", "i"},
                {"ö", "o"},
                {"ş", "s"},
                {"ü", "u"},
                {"'", ""},
                {quote, ""},
                {" - ", "-"},
                {"!", ""},
                {"+", ""},
                {"%", ""},
                {"&", ""},
                {"/", ""},
                {"(", ""},
                {")", ""},
                {"=", ""},
                {"?", ""},
                {"*", ""},
                //{"_", ""},
                {"|", ""},
                {":", ""},
                {";", ""},
                {"<", ""},
                {">", ""},
                {" ", "-"},
                {",", ""},
		{"’", ""},
		{"-–-","-"}
                //{".", ""}

            };


            String strOutput = kelime;
            for(String[] replacement: replacements) {
            strOutput = strOutput.replace(replacement[0], replacement[1]);
        }

        System.out.println(strOutput);


        }
    }
