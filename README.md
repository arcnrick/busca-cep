# busca-cep
Aplicação que consome uma API de cep (no caso a _viaCep_) via feign.

Esse é um projeto de estudo e foi baseado em repositório disponibilizado por: **valquiriamatter** em https://github.com/valquiriamatter/feign

Geralmente, quando queremos consumir dados a partir de um WebService, precisamos de um cliente http que seja capaz de fazer a requisição para nós. O problema, é que a maioria das vezes é muito complicado e trabalhoso fazermos isso, sem falar que o código que escrevemos para cada requisição pode se tornar repetitivo. O Feign foi criado justamente com o objetivo de reduzir a complexidade para consumir esses serviços.

Feign é um projeto que foi inspirado em Retrofit, JAXRS-2.0 e WebSocket. Ele utiliza de anotações plugáveis que podem ser anotações Feign, JAX-RS, entre outras.

Para facilitar nossa vida, o Spring incorporou o Feign em sua stack de cloud, simplificando ainda mais a configuração e integração com nossa aplicação. Dessa forma, podemos reaproveitar as anotações que utilizamos para criar WebServices, como GetMapping, PathVariable, etc.



Conteúdo extraído de: https://felixgilioli.medium.com/feign-uma-maneira-elegante-de-criar-clientes-http-em-java-c7c13c318cbe