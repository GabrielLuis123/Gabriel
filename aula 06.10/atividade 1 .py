class LIVRO:
    def __init__(self, titulo, autor,ano_publicacao): 
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacao = ano_publicacao
    def ta(self):
        print(f"O TITULO DO LIVRO É {self.titulo}, O AUTOR DO LIVRO É {self.autor}, O ANO DE PUBLICAÇÃO É {self.ano_publicacao}")

titulo = input (str("Digite o nome do Titulo do Livro: "))
autor = input (str("Digite o nome do autor: "))
ano_publicacao = input (str("Digite o ano de publicação do Livro: "))

livro1 = LIVRO(titulo, autor, ano_publicacao)
livro1.ta()
