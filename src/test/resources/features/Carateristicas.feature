@stories
Feature: Academy Choucair
  As a user, I want to createa new user in Utest
  @scenario1
  Scenario: create a new user
    Given than Gustavo wants to create a new user in Utest page
    | strLabelJoin  |
    |  Join Today   |
    When he complete all data for register as a new user in Utest page
    | strFirstName  |  strLastname  | strEmail |  strCity   | strPotalCode | strCountry |  strPcOs | strPcVersion | strPcLenguage  |  strMobile  | strMoobileModel | strMoobilOs |  strPassword | strConfirmPassword |
    | TusNombres    | TusApellidos  | TuCorreo |  TuCiudad  | TuCodigo     |    TuPais  | TuSOPC   |  TuversionSO |  TuLenuajePC   | TuMarcaMovil| TuDodeloMovil   | TuSOMovil   |  TuClave     |      TuClave       |
    Then he can see at the page a welcome message
    | strConfirmMessage   |
    | We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world!   |