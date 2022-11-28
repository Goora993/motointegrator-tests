# motointegrator-tests

## Zadanie 1
Zadanie 1 zostało wykonane przy użyciu frameworków: Selenide i JUnit5 oraz Maven Surefire Plugin.
Testy można uruchomić na dwa sposoby:
### Sposób 1
Za pomocą polecenia: 
```
mvn clean test -Dtest-profile=test-env
```

### Sposób 2 (dla użytkowników IntelliJ)
1. Otworzyć panel Edit Configuration
<img src="https://user-images.githubusercontent.com/57013171/204394846-eb3b648d-b837-4082-a308-dbaae3f5aaf3.png" width=25% height=25%>

2. Dodać konfigurację JUnit
<img src="https://user-images.githubusercontent.com/57013171/204395079-e108e9a7-d15a-4c3c-b1c4-cedbf1c354d7.png" width=50% height=50%>

3. Jako typ zasobu, w którym będą wyszukiwane testy wybrać opcję Class, a następnie podać odpowiednią ścieżkę do tej klasy. W polu VM options dodać następujący argument: _-Dtest-profile=test-env_
Dzięki temu IntelliJ będzie uruchamiał testy korzystając z test-env.properties
<img src="https://user-images.githubusercontent.com/57013171/204395476-de2493f0-3607-4d5d-b2c3-ec3ed1865d6d.png" width=50% height=50%>

4. Po zatwierdzeniu zmian i zamknięcia okienka, można uruchamiać testy z poziomu IntellJ za pomocą zielonego przycisku Run.


## Zadanie 2
W repozytorium znajduje się plik o nazwie Task2.txt -> W tym pliku zawarłem rozwiązanie drugiego zadania.

