package com.example.ageapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//Declarations
        val enterAge = findViewById<EditText>(R.id.enterAge)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val textOutput = findViewById<TextView>(R.id.textOutput)


        // A reset button that will reset the app and clear all fields
        resetButton?.setOnClickListener {
            enterAge.editableText.clear()
            textOutput.text = "Waiting for your age"

        }

        // checking the condition of the submit button, checking if it has been pressed or not
        submitButton?.setOnClickListener {

            // converting enterAge to a int and storing it in a variable called age
            // Getting age from user input
            val age: Int = enterAge.text.toString().toInt()

// Checking if age is within range
            if (age in 20..100) {
                // Matching entered age to famous person
                val matchAge: String = when (age) {
                    20 -> "You are 20. James Dean died at 20, he was an iconic actor known for his role in 'Rebel Without a Cause.'"
                    21 -> "You are 21. Marilyn Monroe died at 21, she was an iconic actress and model."
                    22 -> "You are 22. Amelia Earhart died at 22, she was a pioneering aviator."
                    23 -> "You are 23. Wolfgang Amadeus Mozart died at 23, he was an influential composer."
                    24 -> "You are 24. Bruce Lee died at 24, he was a martial artist and actor."
                    25 -> "You are 25. Princess Diana died at 25, she was a beloved humanitarian."
                    26 -> "You are 26. Alexander the Great died at 26, he was a Macedonian king."
                    27 -> "You are 27. Vincent van Gogh died at 27, he was a Dutch artist."
                    28 -> "You are 28. John F. Kennedy died at 28, he was the 35th US President."
                    29 -> "You are 29. Joan of Arc died at 29, she was a French heroine."
                    30 -> "You are 30. Freddie Mercury died at 30, he was the lead singer of Queen."
                    31 -> "You are 31. Albert Einstein died at 31, he was a theoretical physicist."
                    32 -> "You are 32. Elvis Presley died at 32, he was known as the 'King of Rock and Roll.'"
                    33 -> "You are 33. Princess Grace Kelly died at 33, she was an actress turned princess."
                    34 -> "You are 34. Robin Williams died at 34, he was a comedic genius."
                    35 -> "You are 35. Leonardo da Vinci died at 35, he was a Renaissance artist."
                    36 -> "You are 36. Martin Luther King Jr. died at 36, he was a civil rights leader."
                    37 -> "You are 37. Cleopatra died at 37, she was the last pharaoh of Egypt."
                    38 -> "You are 38. Tupac Shakur died at 38, he was an influential rapper and actor."
                    39 -> "You are 39. Winston Churchill died at 39, he was a British Prime Minister."
                    40 -> "You are 40. John Lennon died at 40, he was a member of the Beatles."
                    41 -> "You are 41. Marilyn Monroe died at 41, she was an iconic actress and model."
                    42 -> "You are 42. Princess Diana died at 42, she was a beloved humanitarian."
                    43 -> "You are 43. Steve Jobs died at 43, he was the co-founder of Apple."
                    44 -> "You are 44. Bruce Lee died at 44, he was a martial artist and actor."
                    45 -> "You are 45. Mahatma Gandhi died at 45, he was an Indian independence leader."
                    46 -> "You are 46. Freddie Mercury died at 46, he was the lead singer of Queen."
                    47 -> "You are 47. Leonardo da Vinci died at 47, he was a Renaissance artist."
                    48 -> "You are 48. John F. Kennedy died at 48, he was the 35th US President."
                    49 -> "You are 49. Albert Einstein died at 49, he was a theoretical physicist."
                    50 -> "You are 50. Princess Grace Kelly died at 50, she was an actress turned princess."
                    51 -> "You are 51. Joan of Arc died at 51, she was a French heroine."
                    52 -> "You are 52. Robin Williams died at 52, he was a comedic genius."
                    53 -> "You are 53. Martin Luther King Jr. died at 53, he was a civil rights leader."
                    54 -> "You are 54. Cleopatra died at 54, she was the last pharaoh of Egypt."
                    55 -> "You are 55. Tupac Shakur died at 55, he was an influential rapper and actor."
                    56 -> "You are 56. Winston Churchill died at 56, he was a British Prime Minister."
                    57 -> "You are 57. John Lennon died at 57, he was a member of the Beatles."
                    58 -> "You are 58. Marilyn Monroe died at 58, she was an iconic actress and model."
                    59 -> "You are 59. Princess Diana died at 59, she was a beloved humanitarian."
                    60 -> "You are 60. Steve Jobs died at 60, he was the co-founder of Apple."
                    61 -> "You are 61. Bruce Lee died at 61, he was a martial artist and actor."
                    62 -> "You are 62. Mahatma Gandhi died at 62, he was an Indian independence leader."
                    63 -> "You are 63. Freddie Mercury died at 63, he was the lead singer of Queen."
                    64 -> "You are 64. Leonardo da Vinci died at 64, he was a Renaissance artist."
                    65 -> "You are 65. John F. Kennedy died at 65, he was the 35th US President."
                    66 -> "You are 66. Albert Einstein died at 66, he was a theoretical physicist."
                    67 -> "You are 67. Princess Grace Kelly died at 67, she was an actress turned princess."
                    68 -> "You are 68. Joan of Arc died at 68, she was a French heroine."
                    69 -> "You are 69. Robin Williams died at 69, he was a comedic genius."
                    70 -> "You are 70. Martin Luther King Jr. died at 70, he was a civil rights leader."
                    71 -> "You are 71. Cleopatra died at 71, she was the last pharaoh of Egypt."
                    72 -> "You are 72. Tupac Shakur died at 72, he was an influential rapper and actor."
                    73 -> "You are 73. Winston Churchill died at 73, he was a British Prime Minister."
                    74 -> "You are 74. John Lennon died at 74, he was a member of the Beatles."
                    75 -> "You are 75. Marilyn Monroe died at 75, she was an iconic actress and model."
                    76 -> "You are 76. Princess Diana died at 76, she was a beloved humanitarian."
                    77 -> "You are 77. Steve Jobs died at 77, he was the co-founder of Apple."
                    78 -> "You are 78. Bruce Lee died at 78, he was a martial artist and actor."
                    79 -> "You are 79. Mahatma Gandhi died at 79, he was an Indian independence leader."
                    80 -> "You are 80. Freddie Mercury died at 80, he was the lead singer of Queen."
                    81 -> "You are 81. Leonardo da Vinci died at 81, he was a Renaissance artist."
                    82 -> "You are 82. John F. Kennedy died at 82, he was the 35th US President."
                    83 -> "You are 83. Albert Einstein died at 83, he was a theoretical physicist."
                    84 -> "You are 84. Princess Grace Kelly died at 84, she was an actress turned princess."
                    85 -> "You are 85. Joan of Arc died at 85, she was a French heroine."
                    86 -> "You are 86. Robin Williams died at 86, he was a comedic genius."
                    87 -> "You are 87. Martin Luther King Jr. died at 87, he was a civil rights leader."
                    88 -> "You are 88. Cleopatra died at 88, she was the last pharaoh of Egypt."
                    89 -> "You are 89. Tupac Shakur died at 89, he was an influential rapper and actor."
                    90 -> "You are 90. Winston Churchill died at 90, he was a British Prime Minister."
                    91 -> "You are 91. John Lennon died at 91, he was a member of the Beatles."
                    92 -> "You are 92. Marilyn Monroe died at 92, she was an iconic actress and model."
                    93 -> "You are 93. Princess Diana died at 93, she was a beloved humanitarian."
                    94 -> "You are 94. Steve Jobs died at 94, he was the co-founder of Apple."
                    95 -> "You are 95. Bruce Lee died at 95, he was a martial artist and actor."
                    96 -> "You are 96. Mahatma Gandhi died at 96, he was an Indian independence leader."
                    97 -> "You are 97. Freddie Mercury died at 97, he was the lead singer of Queen."
                    98 -> "You are 98. Leonardo da Vinci died at 98, he was a Renaissance artist."
                    99 -> "You are 99. John F. Kennedy died at 99, he was the 35th US President."
                    100 -> "You are 100. Albert Einstein died at 100, he was a theoretical physicist."
                    else -> "You are $age years old, we have no matches for this age"
                }
                // Outputting the matched age text
                textOutput.text = matchAge
            } else {
                // If age is not within the range, display a toast message
                Toast.makeText(
                    this,
                    "Your age is not within 20 to 100 years old",
                    Toast.LENGTH_SHORT
                ).show()
                // Also update the text output accordingly
                textOutput.text = "Your age is not within 20 to 100 years old"
            }

        }
    }
}