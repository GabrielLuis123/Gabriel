import tkinter as tk
from tkinter import messagebox

# Função para exibir a mensagem e o nome do usuário
def exibir_mensagem():
    nome = nome_entry.get()  # Obtém o nome do campo de entrada
    mensagem = mensagem_entry.get("1.0", "end-1c")  # Obtém a mensagem do campo de texto

    # Cria uma nova janela para exibir a mensagem e o nome
    nova_janela = tk.Toplevel(root)
    nova_janela.title("Mensagem do Usuário")

    # Cria e exibe rótulos com o nome e a mensagem
    tk.Label(nova_janela, text=f"Nome: {nome}").pack()
    tk.Label(nova_janela, text=f"Mensagem: {mensagem}").pack()

# Configura a janela principal
root = tk.Tk()
root.title("JANELA DO GOOGLE")

# Cria campos de entrada para o nome e a mensagem
nome_label = tk.Label(root, text="Seu Nome:")
nome_label.pack()
nome_entry = tk.Entry(root)
nome_entry.pack()

mensagem_label = tk.Label(root, text="Sua Mensagem:")
mensagem_label.pack()
mensagem_entry = tk.Text(root, height=5, width=30)
mensagem_entry.pack()

# Cria um botão para enviar a mensagem
enviar_button = tk.Button(root, text="Manda Bala", command=exibir_mensagem)
enviar_button.pack()

# Inicia o loop principal da interface gráfica
root.mainloop()
