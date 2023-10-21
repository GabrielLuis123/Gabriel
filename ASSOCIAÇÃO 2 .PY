class Estudante:
    def __init__(self, nome):
      self.nome = nome  

class Turma:
    def __init__(self,nome):
       self.nome = nome
       self.estudantes = []
    
    
    def adicionar_estudantes (self, estudante):
        self.estudantes.append(estudante)

joao = Estudante("João")
maria = Estudante("Maria")


TurmaA = Turma("Turma A")
TurmaA.adicionar_estudantes(joao)
TurmaA.adicionar_estudantes(maria)

