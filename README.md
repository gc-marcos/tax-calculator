# 🧾 Calculadora de Imposto ICMS por Estado

Este repositório contém o projeto **Calculadora do Imposto ICMS por Estado** desenvolvido em **Java**, seguindo as boas práticas de desenvolvimento e estruturação. O projeto foi implementado no **Android Studio**, utilizando a arquitetura padrão com pastas organizadas para facilitar a manutenção e escalabilidade.

---

## 📚 Sobre o Projeto

A aplicação permite calcular o **ICMS (Imposto sobre Circulação de Mercadorias e Serviços)** de acordo com as alíquotas específicas de cada estado brasileiro. O usuário pode selecionar um estado, inserir o valor do produto/serviço e visualizar o imposto calculado.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **IDE:** Android Studio  
- **Gradle:** Gerenciamento de build e dependências  
- **Arquitetura:** Padrão de estrutura Android (manifests, java, res)

---

## 📂 Estrutura do Repositório

```plaintext
tax-calculator/
├── app/                 
│   ├── manifests/       # Arquivo AndroidManifest.xml
│   ├── java/            # Código fonte em Java
│   └── res/             # Recursos do projeto (layouts, strings, drawables)
├── Gradle Scripts/      # Arquivos de build e dependências
└── README.md            # Documentação do projeto
```

---

## 🚀 Funcionalidades

- Seleção de estados brasileiros.  
- Cálculo automático do ICMS com base no valor informado e na alíquota estadual.  
- Interface amigável e responsiva.  
- Validação de entradas (valores nulos ou inválidos).  

---

## 🎨 Boas Práticas Adotadas

- Organização do projeto utilizando a estrutura padrão do Android (manifests, java, res).  
- Código limpo, indentado e bem comentado.  
- Uso de nomes semânticos para classes, métodos e variáveis.  
- Gerenciamento de dependências via Gradle Scripts.  
- Separação de lógica de negócio e interface para melhor manutenção.  

---

## ⚙️ Como Executar o Projeto

1. **Pré-requisitos:**
   - Android Studio instalado.  
   - JDK configurado no ambiente.  

2. **Clone o repositório:**
   ```bash
   git clone https://github.com/usuario/tax-calculator.git
   cd tax-calculator
   ```

3. **Abra o projeto no Android Studio:**  
   - Selecione a pasta raiz do projeto.  
   - Aguarde o Gradle sincronizar as dependências.  

4. **Execute o projeto:**  
   - Conecte um dispositivo Android ou utilize um emulador.  
   - Clique no botão **Run** para iniciar a aplicação.

---

## 📈 Próximos Passos

- [ ] Adicionar suporte para outros tipos de impostos.  
- [ ] Implementar persistência de dados com banco local (SQLite).  
- [ ] Incluir testes unitários para validação da lógica de cálculo.  
- [ ] Melhorar a interface com Material Design.

---

## 📝 Licença

Este projeto está licenciado sob a licença **MIT**. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Siga os passos abaixo para contribuir com o projeto:  

1. Faça um fork deste repositório.  
2. Crie uma nova branch com sua funcionalidade ou correção:  
   ```bash
   git checkout -b minha-nova-feature
   ```  
3. Commit suas alterações:  
   ```bash
   git commit -m "Adiciona funcionalidade X"
   ```  
4. Envie suas alterações:  
   ```bash
   git push origin minha-nova-feature
   ```  
5. Abra um Pull Request.

---
## 💪 Development Team

People who contributed to this repository.

[![Marcos](https://avatars.githubusercontent.com/u/96779141?s=100)](https://github.com/gc-marcos) 
