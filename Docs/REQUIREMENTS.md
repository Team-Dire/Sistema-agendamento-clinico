# Requisitos funcionais

### Agendamento de consultas
- R.1 O sistema deve autenticar os usuários e classificá-los em médicos ou secretários. (E)
- R.2 O sistema deve permitir que os secretários agendem consultas com até 60 dias de antecedência, e pelo menos, 30 minutos de antecedência. (E)
- R.3 O sistema deve permitir que secretários confirmem um horário agendado de um paciente pelo menos 7 dias antes da data agendada. (E)
- R.4 O sistema deve emitir uma notificação por pop-up aos secretários que possuem consultas agendadas que não foram confirmadas 1 dia útil antes da data agendada. (E)
- R.5 O sistema deve permitir que os médicos, e seus respectivos secretários, verifiquem os horários agendados de cada paciente. (E)
- R.6 O sistema deve permitir que os verifiquem seus horários agendados para o dia especificado pelo usuário. (E)
- R.7 O sistema deve permitir que os secretários cancelem as consultas agendadas. (E)
- R.8 O sistema deve permitir que os secretários verifiquem os horários disponíveis do médico. (E)
- R.9 O sistema deve permitir que cada médico seja associado a um determinado secretário, podendo um secretário possuir mais de um médico. (E)

### Pagamentos
- R.10 O sistema deve permitir que os pacientes realizem o pagamento por convênio ou particular. (E)
- R.10.1 O pagamento da consulta deverá ser realizado no respectivo dia da consulta, antes do paciente ser consultado. (E)
- R.10.2 O pagamento não será validado pelo sistema, mas o tipo de pagamento deverá ser informado e autorizado pelo secretário. (E)
- R.10.3 O sistema deve permitir que o sistema aceite o pagamento de novos convênios posteriormente. (E)
- R.10.4 O sistema deve permitir que os tipos de pagamento privado sejam realizados por cartão de crédito, débito ou pix. (E)

### Relatórios
- R.11 O sistema deve permitir que os secretários verifiquem o histórico de consultas de um médico há 1 mês, 3 meses, ou 1 ano atrás. (E)
- R.12 O sistema deve permitir que os secretários verifiquem a lista de pacientes nos quais já foram atendidos pelo médico há 1 mês, 1 ano, ou desde o início do software. (E)

### Refinamento da agenda
- R.13 O sistema deve permitir que secretários adiem os horários agendados ou confirmados dos pacientes. (E)
- R.13.1. Os horários adiados deverão ser confirmados novamente de acordo com o requisito 2. (E)
- R.14 O sistema deve impedir o agendamento de horários durante o período de férias do médico. (E)
- R.14.1 O período de férias deve ser determinado com 60 dias de antecedência e informado pelo secretário. (E)
- R.15 O sistema deve permitir que os secretários informem o horário de entrada e saída das consultas dos pacientes. (E)
- R.16 O sistema deve permitir que os secretários permitam o encaixe de pacientes. (E)
- R.16.1 O encaixe deverá permitir que dois pacientes ocupem o mesmo horário num mesmo dia, caso o médico esteja com o horário de consultas adiantado. (E)
- R.16.2 Um médico está com o horário de consultas adiantado, caso a saída do paciente ocorreu antes do horário de entrada do próximo paciente. (E)