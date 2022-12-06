Feature: Funcionalidade de login BDD
    @TestCaseKey=PBDGQ-T4
    Scenario: Funcionalidade de login BDD
        
        Given que o cliente sem cadastro deseja criar uma conta
        
        And tenta fazer login
        
        When informar dados incorretos de acesso
        
        Then aparecerá uma mensagem na tela 'Dados incorretos'