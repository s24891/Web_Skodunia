--liquibase formatted sql
--changeset alopalka:2
--comment: 2024-01-10
--dbms: h2

insert into cars (id, make, model, description, manufacture_year, price_per_day)
values (1, 'Mercedes', 'S-Class', 'Przeznaczony dla tych, którzy cenią sobie luksus i wyrafinowanie, Mercedes S-Class jest ikoną komfortu i zaawansowanej technologii. Idealny na długie podróże, zapewniający pasażerom przestronne wnętrze i ciche środowisko jazdy.', 2020, 500),
       (2, 'BMW', '7 Series', 'To szczyt niemieckiej inżynierii, BMW 7 Series łączy w sobie elegancję i moc, zapewniając doskonałe wrażenia z jazdy. Zawiera zaawansowane funkcje technologiczne, które czynią jazdę łatwą i przyjemną, zarówno dla kierowcy, jak i pasażerów.', 2019, 450),
       (3, 'Audi', 'A8', 'Audi A8 redefiniuje pojęcie luksusowego sedanu, oferując niezrównane wrażenia z jazdy, wyrafinowany design i najnowsze technologie. Jest to samochód dla tych, którzy szukają doskonałego połączenia wydajności, komfortu i stylu.', 2021, 480),
       (4, 'Lexus', 'LS', 'Lexus LS to kwintesencja luksusu i wyrafinowania. Z jego imponującą niezawodnością i wyjątkowym komfortem jazdy, LS jest idealnym wyborem dla tych, którzy cenią sobie spokój i luksus.', 2018, 430),
       (5, 'Jaguar', 'XJ', 'Jaguar XJ to więcej niż samochód - to wyraz klasy i prestiżu. Połączenie brytyjskiego stylu z oszałamiającymi osiągami sprawia, że XJ wyróżnia się na drodze jako symbol elegancji i mocy.', 2019, 470),
       (6, 'Porsche', 'Panamera', ' Porsche Panamera to samochód, który łączy luksusową przestrzeń i komfort z emocjonującymi osiągami sportowymi. To idealny wybór dla tych, którzy oczekują zarówno dynamiki, jak i przestronności.', 2020, 550),
       (7, 'Tesla', 'Model S', 'Model S od Tesli to więcej niż elektryczny samochód, to przyszłość motoryzacji. Z jego imponującym zasięgiem, przyspieszeniem i innowacyjnymi funkcjami, Model S jest przełomem w ekologicznej technologii.', 2021, 500),
       (8, 'Maserati', 'Quattroporte', 'Quattroporte łączy w sobie włoski design z niezwykłym wykonaniem, oferując wrażenia luksusu i sportowego ducha. To samochód dla tych, którzy pragną wyjątkowej elegancji połączonej z emocjonującą mocą i wydajnością.', 2019, 520),
       (9, 'Bentley', 'Flying Spur', 'Bentley Flying Spur jest kwintesencją brytyjskiego luksusu. Z niezrównanym komfortem, wyszukanymi materiałami i potężnym silnikiem, Flying Spur oferuje wyjątkowe wrażenia dla najbardziej wymagających klientów.', 2020, 600),
       (10, 'Rolls Royce', 'Phantom', 'Rolls Royce Phantom to więcej niż samochód, to dzieło sztuki. Każdy aspekt tego pojazdu jest dopracowany do perfekcji, oferując niezrównane wrażenia luksusu, spokoju i prestiżu.', 2021, 700),
       (11, 'Ferrari', 'Portofino', 'Ferrari Portofino to esencja włoskiego stylu i wydajności. Ten supercar łączy w sobie niesamowite osiągi z elegancją i luksusem, zapewniając wrażenia, jakich nie da żaden inny samochód.', 2018, 650),
       (12, 'Lamborghini', 'Huracan', ' Lamborghini Huracan to synonim ekstremalnej wydajności i włoskiego designu. Jest to samochód, który nie tylko przyciąga uwagę swoim wyglądem, ale także zapewnia niesamowite wrażenia z jazdy.', 2020, 700),
       (13, 'Aston Martin', 'DB11', ' Aston Martin DB11 to połączenie tradycji z nowoczesnością. Ten elegancki, luksusowy samochód oferuje zarówno moc i osiągi, jak i wyrafinowany komfort, czyniąc go idealnym wyborem dla koneserów.', 2019, 550),
       (14, 'Alfa Romeo', 'Giulia', 'Alfa Romeo Giulia to samochód, który łączy w sobie sportowy charakter z eleganckim designem. Giulia zapewnia nie tylko emocjonujące osiągi, ale również wygodę i styl, który wyróżnia się na drodze.', 2021, 400),
       (15, 'McLaren', 'GT', 'McLaren GT to samochód sportowy, który oferuje nie tylko wyjątkowe osiągi, ale także komfort i praktyczność. Jest to idealne połączenie dla tych, którzy chcą łączyć przyjemność z jazdy z codziennym użytkowaniem.', 2020, 750),
       (16, 'Bugatti', 'Chiron', 'Bugatti Chiron to ikona w świecie supercarów. Z niezrównaną mocą i luksusem, Chiron ustanawia nowe standardy w zakresie wydajności i designu, oferując niespotykane doświadczenia zarówno na drodze, jak i poza nią.', 2021, 1500),
       (17, 'Koenigsegg', 'Jesko', 'Koenigsegg Jesko to apogeum inżynierii i designu. Jest to samochód, który przekracza granice możliwości motoryzacyjnych, oferując osiągi na poziomie hipersamochodu i niezrównane wrażenia z jazdy.', 2020, 2000),
       (18, 'Pagani', 'Huayra', 'Pagani Huayra łączy w sobie niezwykłą moc z artystycznym wykonaniem. Ten samochód to połączenie wyszukanej estetyki z oszałamiającymi osiągami, sprawiając, że każda jazda jest niezapomnianym doświadczeniem.', 2019, 1300),
       (19, 'Lotus', 'Evija', 'Lotus Evija to rewolucja w świecie elektrycznych hipersamochodów. Z jej futurystycznym designem i imponującymi osiągami, Evija definiuje nowe standardy w dziedzinie ekologicznych samochodów sportowych.', 2021, 950),
       (20, 'Polestar', '1', 'Polestar 1 to hybrydowe coupe, które łączy w sobie elegancję z ekologicznymi osiągami. Jest to samochód dla tych, którzy szukają harmonii między stylem, wydajnością i świadomością środowiskową.', 2020, 500);

