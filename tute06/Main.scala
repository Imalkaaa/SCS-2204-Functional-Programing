
    object caesarCipher extends App {
      val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      def encrypt(text: String, shift: Int): String = {

        text.toUpperCase.map(c => {
          if (alphabet.contains(c)) {
            val index = (alphabet.indexOf(c) + shift) % alphabet.length;
            alphabet(index)
          }
          else {
            c
          }
        })
      }


      def decrypt(text: String, shift: Int): String = {
        encrypt(text, alphabet.length - shift)
      }


      def cipher(text: String, shift: Int, f: (String, Int) => String): String = {
        f(text, shift)
      }

      val plaintext = "Imalka1";
      val shift = 2;

      val encryptedText = cipher(plaintext, shift, encrypt);
      println(encryptedText)

      val decryptedText = cipher(encryptedText, shift, decrypt);
      println(decryptedText)

      
}