# Unit(Birim) Test nedir?
Unit(birim) testi, bir yazılımın ayrı birimlerinin veya bileşenlerinin test edildiği bir tür yazılım testidir. Amaç, yazılım kodunun her biriminin beklendiği gibi çalıştığını doğrulamaktır. 
Unit Testi, geliştiriciler tarafından bir uygulamanın geliştirilmesi (kodlama aşaması) sırasında yapılır. Unit Testleri, kodun bir bölümünü ayırır ve doğruluğunu onaylar. 
Bir unit, bireysel bir işlev, yöntem, prosedür, modül veya nesne olabilir.

## Neden Unit Test yaparız?
Buradaki amacımız yazılımın her biriminin tasarlandığı şekilde gerçekleştiğini doğrulamaktır.
Unit Test yazmak kodda yeniden düzenleme(Refactor) işlemini yapmayı kolaylaştırır.
Kodda değişiklik yaptığımızda, Unit Testi çalıştırıp oluşturduğumuz algoritmaya uygun bir şekilde 
çalışıp çalışmadığını kolaylıkla test edebiliriz. 
Unit Test’ ler tüm hataları ortaya çıkarmaz, 
çünkü her parça izole şekilde test edilmekte ve entegrasyon yapıldığında herşeyin düzenli çalışacağı anlamına gelmez.

### Bazı Unit Test Framework’leri:
- **Robot Framework**
- **JUnit**
- **Spock**
- **NUnit**
- **TestNG**
- **Jasmin**
- **Mocha**


# JUnit nedir? JUnit Annotationsları nelerdir?
JUnit, regresyon testi için en iyi test yöntemlerinden biri olan bir Java birim test frameworküdür.
Open-source framework olarak, tekrarlanabilir otomatik testler yazmak ve çalıştırmak için kullanılır.

JUnit Annotations(nostasyonları), daha iyi kod okunabilirliği ve yapısı için Java kaynak koduna eklenebilen özel 
bir sözdizimsel meta-veri biçimidir.

| **JUNIT 4 ANNOTATION** | **JUNIT 5 ANNOTATION** |
| :-------- | :------- | 
| @Before	 | @BeforeEach | 
| @After	 | @AfterEach | 
| @BeforeClass	 | @BeforeAll | 
| @AfterClass	 | @AfterAll | 
| @Test	 | @Test | 

# 

	
| **ANNOTATION** | **EXPLANATION** |
| :-------- | :------- | 
| @Test		 | Bu nostasyon, eklendiği public void yönteminin bir test Senaryosu olarak yürütülebileceğini göstermektedir. | 
| @Before		 | Bu nostasyon, her test senaryosundan önce ön koşullar gibi bazı ifadeleri yürütmek için kullanılır. Tüm test durumlarından önce yürütülür. | 
| @BeforeClass		 | Bu nostasyon, tüm test senaryolarından önce bazı ifadeleri yürütmek isteniyorsa kullanılır. Sınıfın başlangıcında bir kez çalışır. | 
| @After		 | Bu nostasyon, her test senaryosundan sonra bazı ifadeleri yürütmek isteniyorsa kullanılır. Tüm test durumlarından sonra yürütülmektedir. | 
| @AfterClass		 | Bu nostasyon, bütün testler bittikten sonra çalışacak metottur. Sınıfın sonunda bir kez çağrılır | 
| @Ignores		 | Bu nostasyon, test yürütme sırasında bazı ifadeleri yok saymak, bazı test senaryolarını devre dışı bırakmak isteniyorsa kullanılabilir. | 
| @Test(timeout=500)		 | Bu nostasyon, test yürütmesi sırasında zaman aşımı ayarlanması isteniyorsa kullanılabilir. | 
| @Test(expected=IllegalArgumentException.class)		 | Bu nostasyon, test yürütme sırasında bazı istisnaları işlemek isteniyorsa kullanılabilir. | 

