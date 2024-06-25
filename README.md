<h1> Boas-vindas ao repositório Tela de Login da Rede Social! </h1>

<h4>Sobre o projeto:</h4>
<p>
Neste projeto, desenvolvi a tela de login de uma rede social. Esta tela de login contém apenas o layout e as validações de interface, não se conectando nesse momento com nenhuma API.<br><br>

🚵 Habilidades a serem trabalhadas:<br><br>

Utilizar Kotlin para manipular os elementos visuais do Android.<br>
Utilizar Kotlin para desenvolver regras de negócio da interface.<br>
Construir layout via XML.<br>
Posicionar os elementos visuais com ViewGroup.<br>
</p>

<h3> Requisitos do Projeto: </h3>

<p> 
<h4> 1. Crie a estrutura inicial da tela com a logo da rede social</h4>
<p>A tela de login terá seu conteúdo principal dentro de um container, que será um LinearLayout. Nesse primeiro requisito vamos fazer a configuração inicial do container e inserir o primeiro elemento que ficará dentro dele: a logo da rede social.</p>

<h4> 2. Crie o campo de Email</h4>
<p>Para conseguir se identificar, a pessoa usuária precisa de um campo para inserir o email que está cadastrado em sua rede social.</p>

<h4> 3. Crie o campo de Senha</h4>
<p>Para conseguir se autenticar, a pessoa usuária precisa de um campo para inserir sua senha.</p>

<h4> 4. Crie o botão de entrar</h4>
<p>Para validar os dados informados, a pessoa usuária precisa apertar o botão Entrar.</p>

<h4> 5. Crie o botão de recuperar senha</h4>
<p>Caso a pessoa esqueça a senha, é necessário ter um botão que a leve para a tela que permite a recuperação da conta.</p>

<h4> 6. Crie o botão de cadastro</h4>
<p>Para pessoas que não possuem conta na rede social, é necessário ter um botão que as leve para a tela que permita o cadastro.</p>

<h4> 7. Implemente a regra de habilitação do botão entrar</h4>
<p>O botão Entrar é desabilitado por padrão. Esse padrão é útil em termos de usabilidade, pois induz a pessoa a inserir as informações nos campos sem precisar apresentar algum tipo de mensagem. A partir do momento que os campos possuem alguma informação, o botão será habilitado.</p>

<h4> 8. Implemente a validação do campo de email</h4>
<p>As pessoas podem entrar com qualquer valor no campo de email. Porém, fazer uma requisição de autenticação com email inválido pode ser custoso para o back-end. Vamos fazer a validação no aplicativo! Caso o email não esteja no formato correto, o campo de email apresentará uma mensagem de erro.</p>

<h4> 9. Implemente a validação do campo de senha</h4>
<p>As pessoas podem entrar com qualquer valor no campo de senha. Vamos fazer uma validação básica de senha, verificando se há uma quantidade mínima de caracteres. Caso não tenha, o campo de senha apresentará uma mensagem de erro.</p>

<h4> 10. Implemente uma mensagem de sucesso no login</h4>
<p>Como estamos desenvolvendo a tela de Login de forma isolada, precisamos apresentar uma mensagem de sucesso caso o login seja feito com sucesso.</p>
</p>
