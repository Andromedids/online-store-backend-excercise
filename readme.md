## Aplikacja Ryneczku Owocu zaprasza!

W tej wstępnie przygotowanej aplikacji webowej będą Państwo mieli możliwość:
* sprawdzenia w praktyce, jak działa połączenie technologii frontendowych z backendowymi
* napisania własnej implementacji kodu w backendzie, które uzupełnią brakujące funckjonalności

Dzięki temu:
- poznają Państwo realne zastosowanie pętli `for` w języku `Java`
- poćwiczą Państwo swoje umiejętności algorytmiczne
- jednocześnie w sposób natychmiastowy będą Państwo mogli przetestować swoje dzieło (swój kod)

## Efekt, do którego dążymy:
Efektem naszego dzisiejszego spotkania będzie w pełni działająca aplikacja, pokazująca wszystkie dostępne owoce na Ryneczku. <br/>
Ale nie tylko to!<br/>
Będzie ona również pokazywać statystyki owoców:
* ile kosztuje najtańszy
* najdroższy
* ile w sumie kosztuję
* ile średnio kosztuje jeden owoc
* a w wersji bardziej zaawansowanej również - ile jest jakich owoców (np jabłek - 2 sztuki, gruszek - 4 sztuki).
  ![Alt text](pictures/demo-lab-efekt.jpeg?raw=true "tak będzie wyglądać strona po realizacji Laboratorium 1/2")
  ![Alt text](pictures/efekt-2.png?raw=true "tak będzie wyglądać strona po realizacji Laboratorium 2/2")


## Adres strony:
[Link Do Ryneczka](https://online-store-frontend-excercise-production.up.railway.app/)

## Jak to osiągnąć?
Przed Państwem instrukcja co krok po kroku wykonać aby uzyskać powyższy efekt. Wpierw upewnijmy się, że wszystko jest zainstalowane poprawnie. Powinno być - ale dla pewności :)

## Kroki przygotowawcze:
1. Wciśnij na klawiaturze znak Windowsa i zacznij wpisywać `git bash`.
    - Jeśli nie pojawia się żaden program o takiej nazwie: ściągnij i zainstaluj `gita` z [tego linku](https://git-scm.com/downloads)
    - Następnie utwórz na `Pulpicie` folder ze swoim imieniem
    - Wejdź w niego
    - I kliknij prawym przyciskiem myszy i wybierz `Git Bash Here`
2. Wciśnij na klawiaturze znak Windowsa i zacznij wpisywać `IntelliJ`
    - Jeśli nie pojawia się żaden program o takiej nazwie: ściągnij i zainstaluj `IntelliJa COMMUNITY` (uwaga - `COMMUNITY`!!) z [tego linku](https://www.jetbrains.com/idea/download/)
3. W `Git Bashu` wpisz polecenie `java -version`. Jeśli pojawił się błąd:
    - Ściągnij i zainstalij Javę `21` (nie `25`!) ze strony [Adoptium](https://adoptium.net/temurin/releases/?arch=any&version=21&os=any)
4. Przescrolluj się na górę i kliknij w zielony przycisk `Code` a następnie `Https`. Skopiuj link, który się wyświetla.
   ![Alt text](pictures/clone.png?raw=true "Skąd wziąć adres githuba?")
5. Następnie otwórz `IntelliJ` i wybierz `File -> New -> Project From Version Control `, wklej adres ze schowka i wybierz swój folder z Pulpitu
   ![Alt text](pictures/save.png?raw=true "wybierz odpowiednie miejsce?")
6. Otwórz projekt i poczekaj, aż zostanie pobrany i zainstalowany kod - w prawym dolnym rogu powinien się już kończyć pasek postępu.
7. Powinno pokazać się okienko sugerujące pracę.
   ![Alt text](pictures/loading.png?raw=true "Czy projekt się konfiguruje w IntelliJu?")
8. Po pewnym czasie powinno się skonfigurować i powinno otworzyć się puste okno a na dole `BUILD 
   SUCCESSFUL`. <br/>
   Kliknij `Project` po lewej
   ![Alt text](pictures/project.png?raw=true "Sukces i co dalej?")
9. Otwórz Ustawienia (`File -> Settings`) (lub `IntelliJ IDEA` -> `Settings...` na MAC OS)
   ![Alt text](pictures/settings.png?raw=true "Gdzie są ustawienia na Windowsie?")
   ![Alt text](pictures/settings-on-mac.png?raw=true "Gdzie są ustawienia na Macu?")
10. Otwórz sekcję `Build, Execution, Deployment`, a w niej `Build Tools -> Gradle` <br/>
    i dla obu `Build and run using` oraz `Run tests using` wybierz `IntelliJ Idea` <br/>
    ![Alt text](pictures/build-execution.png?raw=true "Co wybrać?!")
11. Otwórz sekcję `Plugins`, w szukajkę wpisz `Lombok`, wybierz plugin z papryczką i Zainstaluj (u
    mnie już jest zainstalowany). <br/>
    Być może trzeba będzie zrestartować Intellija.
    ![Alt text](pictures/lombok.png?raw=true "Jak wygląda Lombok?!")
12. W prawym dolnym rogu powinno się pokazać okienko włączenia procesowania adnotacji.<br/>
    Jeśli się nie pojawiło, wejdź w Ustawienia (punkt 9) i wyszukaj `enable ann` i znajdź sekcję pokazaną poniżej i zaznacz.
    ![Alt text](pictures/enable-lombok.png?raw=true "Jak wygląda to okienko?!")
    ![Alt text](pictures/enable-ann-processing.png?raw=true "Gdzie się włącza te adnotacje?!")<br/>
13. Po kliknięciu, powinno być widoczne drzewo plików oraz nie powinno być żadnych błędów.
    ![Alt text](pictures/no-errors.png?raw=true "Sukces!")
14. **GDYBY JEDNAK NIE** - wejdź w `Git basha` (tam gdzie był*ś) lub w Terminal, wejdź do
    katalogu z projektem i wywołaj `./gradlew build` i poczekaj, aż skończy działać. <br/>
    ![Alt text](pictures/gradlew-build.png?raw=true "A co jeśli mi nie działa?")
15. Jeśli kod nie działa i dużo klas świeci na czerwono oraz zauważysz w prawym dolnym rogu małe
    okienko a w nim komunikat `Lombok..` (jak w pkt 11),<br/>
    lub również w prawym dolnym rogu przy `Event Log` pojawi się czerwone,<br/>
    kliknij na niebieski tekst "enable". (prawdopodobnie krok 18 nie został wykonany poprawnie)
16. **GDYBY NADAL NIE** - poproś Prowadzącą :)

### Zawsze restartując program, wyłączaj poprzednie działania czerwonym kwadracikiem!
<br/> <br/>

## Brawo! środowisko skonfigurowane, czas na implementację!
1. Proszę otworzyć stronę Projektu w przeglądarce `Chrome`: [Link Do Ryneczka](https://online-store-frontend-excercise-production.up.railway.app/)
2. Proszę zobaczyć - Ryneczek nie może się załadować :( .
   ![Alte text](pictures/nie-moze-sie-zaladowac-gdy-aplikacja-nie-dziala.png?raw=true "Strona gdy się nie może połączyć z aplikacją")
3. Musimy uruchomić aplikację backendową. Już mają Państwo ją otwartą w IntelliJu. Proszę zlokalizować plik `OnlineStoreBackendExcerciseApplication` i go otworzyć5. ![Alt text](pictures/enable-lombok.png?raw=true "A co jeśli lombok nie działa?")
   ![Alt text](pictures/gdzie-jest-main.png?raw=true "Gdzie jest main")
4. Po zlokalizowaniu pliku uruchommy aplikację. Proszę odnaleźć zielony trójkącik przy numerach linii, kliknąć go a następnie poszukać na dole "Started OnlineStoreBackendExcerciseApplication" - jak na zrzucie ekranu poniżej.
   ![Alt text](pictures/jak-uruchomic-maina.png?raw=true "Jak uruchomić maina")
5. Proszę przejść w przeglądarkę i odświeżyć stronę. Tym razem zobaczymy pusty Ryneczek:
   ![Alt text](pictures/pusty-ryneczek.png?raw=true "Pusty Ryneczek")
6. Wspaniale! To oznacza, że przeglądarka umie połączyć się z naszą aplikacją w Javie. Aplikacja w Javie nie zwraca danych - stąd myślące emotki zamiast danych.
7. Czas to zmienić - czyli przechodzimy do sedna laboratoriów :)
8. W przeglądarce, proszę dodać 3 owocki po prostu wpisując dane. Do ułatwienia poniżej podaję przykładowe dane:
   * nazwa: `jabłko`, cena: `4`, link do obrazka: `https://sadygrojeckie.pl/wp-content/uploads/2023/03/galazwieza.jpg`
   * nazwa: `gruszka`, cena: `6`, link do obrazka: `https://azcdn.doz.pl/image/d/wiki-herb/03270f04-scale-795x350.webp`
   * nazwa: `mandarynki`, cena: `12`, link do obrazka: `https://www.maczfit.pl/blog/wp-content/uploads/2025/10/mandarynki-indeks-glikemiczny.webp`
9. Proszę uzupełnić dane i wcisnąć guzik, jak na obrazku poniżej:
   ![Alt text](pictures/demo-dodawania-owocow.png?raw=true "Tak uzupełnij dane")
10. Po kliknięciu "Dostarcz prosto na ryneczek" - dodawany owoc powinien od razu się pokazać! :)
    ![Alt text](pictures/jablko.png?raw=true "Dodany owoc")
11. Analogicznie proszę dodać 2 inne owoce, o różnych cenach i linkach.
12. Dobrze - ale nadal nie pokazuje się nam najtańszy owoc, ani żadne statystyki. Czas to zmienić!
    ![Alt text](pictures/najtanszy.png?raw=true "Brak statystyk")
13. Każdy zapisany owoc zapisuje się w naszej aplikacji Javovej w liście. Proszę odnaleźć plik `FruitService` i go otworzyć. Tu znajduje się lista owoców, do której dodajemy owoce.
    ![Alt text](pictures/Fruit.png?raw=true "Tak wygląda FruitService i Fruit")
14. Również w klasie `FruitService` są owocki zapisywane...
   ![Alt text](pictures/jak-dziala-save.png?raw=true "Tu zapisywane są owocki")
15. ... Ale również tu znajdują się metody, które będziemy uzupełniać. 
    * metoda zwracająca najtańszy owoc
    * metoda zwracająca najdrozszy owoc
    * metoda zwracająca średni koszt wszystkich owocków
    * oraz ich sumarycznę cenę
    * i w wersji rozszerzonej: ile jest jakich owoców
      ![Alt text](pictures/metody-do-uzupelnienia.png?raw=true "Te metody będą Państwo uzupełniać")
16. Zacznijmy od metody zwracającej najtańszy owoc czyli `getCheapest`. Będziemy w niej pisać kod. Jaki?
    * Aby znaleźć najtańszy owoc ze *wszystkich* owoców... musimy wpierw przeczytać wszystkie owoce.
    * Następnie wśród ich *wszystkich* wybrać ten jeden - najtańszy.
    * Za każdym razem, gdy słyszą Państwo *wszystkich* = prawdopodobnie chodzi o pętlę for. Przechodzącą przez każdy element w liście. Listy są podobne do tablic, elementy również znajdują się pod indeksami liczonymi od `0`.
    * Aby znaleźć najtańszy owoc należy zatem... kto ma pomysł :)? 
    * Uwaga, poniżej spojler!
      * ... należy stworzyć sobie zmienną pomocniczą nad pętlą, w której będziemy przechowywać aktualnie najtańszy owoc. Uwaga - jaką cenę powinien mieć ten owoc? 
      * następnie w pętli for przejść przez każdy element z listy...
      * .. i porównać cenę każdego elementu(owocka) z ceną `aktualnieNajtanszegoOwoca`.
      * jeśli jest mniejsza niż aktualna cena naszego `aktualniegoNajmniejszegoOwocu`, to znaczy, że
      * należy zupdatować: od teraz `aktualnieNajtanszyOwoc` to ten z listy
      * a po pętli for, należy zwrócić znaleziony obiekt
    * Po zaimplementowaniu metody, proszę zrestartować aplikację (pkt 4) i ponownie dodać owocki. 
    * Teraz powinno działać- znajdywać najtańszy owoc!
17. Przejdźmy do następnej metody - zwracającej najdroższy owoc, czyli `getMostExpensive`. 
    * Czy potrafią ją Państwo w analogiczny sposób zaimplementować? 
18. Proszę przetestować czy działa, restartując backend i na nowo zapisując owocki przez `Chroma`
19. Przejdźmy do kolejnej metody - obliczającej sumę cen owoców. 
20. Czy potrafią ją Państwo samodzielnie zaimplementować? W razie problemów, proszę zwrócić się po pomoc do Prowadzącej - chętnie wytłumaczę jak to zrozumieć i zaimplementować.
21. Proszę zrestartować serwer i przetestować w przeglądarce czy nowa funkcja jest poprawnie zaimplementowana.
22. Na koniec przejdźmy do metody obliczającej średnią cene owoców. Obliczanie średniej - to tak na prawdę ... dzielenie sumy przez liczbę elementów. 
23. Obliczanie sumy cen już Państwo macie. Liczbe elementów wyciągnięcie Panstwo przez: `fruits.size()`. Czy potrafią to Państwo teraz wykorzystać :)?
24. Brawo! Większość podstawowych funkcjonalności już działa!
25. BONUS:
    * ile jest jakich owoców? Tu poznacie Państwo coś nowego :) Proszę zwrócić się do Prowadzącej, razem to zaimplementujemy. 