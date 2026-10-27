# Ride Sharing System (Hafta 5)

Laboratuvarda yaptığımız sürüş ücreti hesaplama ödevi. Sınıf hiyerarşisi ve kalıtım (inheritance) kullanıldı.

### Yapı
- `Ride`: Temel sürüş sınıfı. Yolcu bilgileri, km ve süreye göre taban ücreti hesaplar.
- `EconomyRide`: `Ride`'dan türüyor, dakika başı ücret ekliyor (min 50 TL şartı var).
- `SharedRide`: `EconomyRide`'dan türüyor, ücreti kişi sayısına bölüp %10 servis ücreti ekliyor.
- `PremiumRide`: `Ride`'dan türüyor, konfor ücreti ve talep çarpanı (surge) ekliyor.
- `Main`: ArrayList içine nesneleri atıp döngüyle bilgileri ve ücretleri yazdırıyor.

### Çalıştırma
```bash
javac *.java
java Main
