package com.shivam.grocery_delivery.data

import com.shivam.grocery_delivery.R

class MyRepository {
     fun getAllMessages():List<Message>{
         return listOf(
             Message(message = "An apple is a crunchy, bright-colored fruit, one of the most popular in the United States. You’ve probably heard the age-old saying, “An apple a day keeps the doctor away.” Although eating apples isn’t a cure-all, it is good for your health.",
             title = "Apple", contentDescription = "Image", image = R.drawable.apple
             ),
             Message(message = "Blueberries contain a plant compound called anthocyanin. This gives blueberries both their blue color and many of their health benefits.Blueberries can help heart health, bone strength, skin health, blood pressure, diabetes management, cancer prevention, and mental health.",
                 title = "Blueberries", contentDescription = "Image", image = R.drawable.blueberries
             ),
             Message(message = "Guava fruits are amazingly rich in antioxidants, vitamin C, potassium, and fiber. This remarkable nutrient content gives them many health benefits.",
                 title = "Guava", contentDescription = "Image", image = R.drawable.gauva
             ),
             Message(message = "The soluble dietary fiber in lemon aids in healthy digestion. Lemons contain about 50 mg of Vitamin C, which is over half the amount of Vitamin C needed in your daily diet. Along with boosting immunity, this burst of Vitamin C can reduce your risk of stroke and heart disease with regular consumption.",
                 title = "Lemon", contentDescription = "Image", image = R.drawable.lemon
             ),
             Message(message = "Oranges are a nutritional powerhouse, packed with vitamins and minerals. The most noteworthy of these is vitamin C, a water-soluble antioxidant that prevents cell damage.",
                 title = "Oranges", contentDescription = "Image", image = R.drawable.oranges
             ),
             Message(message = "Pineapple is said to have originated from South America and is rich in nutrients and antioxidants that can fight inflammation. Also, known as Ananas comosus, this healthy fruit has loads of health benefits that can aid in good digestion and boost your immunity. This fruit is also good for your hair, skin and bones.",
                 title = "Pineapple", contentDescription = "Image", image = R.drawable.pineapple
             ),
             Message(message = "A pomegranate is a sweet, tart fruit with thick, red skin. While the skin is not edible, it holds hundreds of juicy seeds that you can eat plain or sprinkle on salads, oatmeal, hummus, and other dishes. Bottled pomegranate juice is also an easy way to enjoy some of the health benefits of this delicious fruit.",
                 title = "Pomegranate", contentDescription = "Image", image = R.drawable.pomegranate
             ),
             Message(message = "Strawberries contain a wide range of bioactive compounds that have shown protective effects against chronic diseases. Their antioxidant and anti-inflammatory effects can improve cognitive function and mental health. Some research suggests that incorporating strawberries, as well as other berries, into your diet can help prevent cardiovascular disease, cancer, Alzheimer's and other disorders.",
                 title = "Strawberry", contentDescription = "Image", image = R.drawable.strawberry
             ),
         )
     }







}