# Interface Segregation Principle (ISP) Uygulama Örneği

Bu proje, S.O.L.I.D prensiplerinden dördüncüsü olan Interface Segregation Principle (ISP)'yi göstermek için hazırlanmıştır. Proje, ISP'yi ihlal eden bir yapıyı ve bu ilkeye uygun olarak yeniden yapılandırılmış bir yapıyı içermektedir.

## Proje Yapısı

Proje, iki ana klasör altında organize edilmiştir:

- **bad**: ISP'nin ihlal edildiği bir yapıyı temsil eder.
- **good**: ISP prensibine uygun olarak yeniden yapılandırılmış yapıyı temsil eder.

### Klasör ve Dosya Yapısı
![image](https://github.com/user-attachments/assets/3914a812-d182-4b43-bcb1-13c8ff263fa5)

### Klasörlerin Açıklamaları

- **bad**: Bu klasörde, `MultiFunctionPrinter`, `SimpleScanner` ve `SimplePrinter` sınıfları `Machine` interface'inden türer, ancak `Machine` interface'inin birden çok sorumluluğu bulunmaktadır. Bu interface'i implement eden tüm sınıflar her özelliği yerine getiremezler. Bu yüzden bu yapı, ISP'yi ihlal eden bir örnek teşkil eder.
  
- **good**: Bu klasörde, her farklı sorumluluk, ayrı interface'lere taşınmıştır.
  - Printer interface'i sadece print metodunu içerir. Belge yazdırma işlevini yerine getirebilecek olan sınıflar bu interface'i implement edebilirler.
  - Fax interface'i sadece fax metodunu içerir. Faks gönderme işlevini yerine getirebilecek olan sınıflar bu interface'i implement edebilirler.
  - Scanner interface'i sadece scan metodunu içerir. Belge tarama işlevini yerine getirebilecek olan sınıflar bu interface'i implement edebilirler.

## Nasıl Çalıştırılır

### ISP İhlali Örneği (bad)

ISP'nin ihlal edildiği yapıyı çalıştırmak için `bad/Application.java` dosyasını çalıştırın.

### ISP'ye Uygun Örnek (good)

ISP prensibine uygun yapıyı görmek için `good/Application.java` dosyasını çalıştırın.

## Neden ISP?

**Interface Segregation Principle**, nesne yönelimli programlamanın beş temel SOLID prensibinden biridir. Bu prensip, büyük ve kapsamlı arayüzlerin, daha küçük ve amaca yönelik arayüzlere bölünmesini savunur. Böylece, sınıflar yalnızca ihtiyaç duydukları metotları içeren arayüzlerle çalışır ve gereksiz bağımlılıklardan kurtulurlar. ISP'ye uygun yapılar, gereksiz kod şişkinliğini önler, sistemdeki bileşenlerin daha esnek ve yönetilebilir olmasını sağlar. Bu prensibe uyulduğunda yazılım geliştirme süreci hızlanır ve bakım maliyetleri azalır, çünkü sınıflar sadece ihtiyaç duydukları sorumluluklarla yüklenir.
