# Documento de Casos de Uso

## Caso de uso: Autenticar um usuário

**Ator:** Usuário (iniciador da ação).

**Finalidade:** Permitir que os usuários sejam identificados e sejam lhe dado acesso a funcionalidades do software.

**Tipo:** Secundário, essencial.

**Descrição:** Um usuário deseja utilizar o software. Ele informa suas credenciais. O software verifica se o usuário existe e se a senha está correta. Se estiver, o usuário é autenticado e as funcionalidades do software são liberadas para ele.

**Referências cruzadas:** R1.

**Sequência típica:**
| Atores | Software |
| --- | --- |
| 1. O usuário executa o software | |
| 2. O usuário insere suas credenciais. | 3. O software verifica se o usuário existe e se a senha está correta. |
| | 4. O software libera as funcionalidades do software de acordo com a categoria do usuário. |
| 5. O usuário utiliza o software. | |

**Sequência alternativa:**: Linha 3. O software verifica se as credenciais são válidas. Se o usuário que deseja ser autenticado não existir, o software irá emitir uma notificação sobre isso.

## Caso de uso: Adicionar um novo usuário ao software

**Ator:** Administrador (iniciador da ação).

**Finalidade:** Permitir que novos usuários sejam adicionados ao software.

**Tipo:** Secundário, essencial.

**Descrição:** Um administrador deseja adicionar um novo usuário ao software. Ele informa as credenciais e a categoria do novo usuário. O software verifica se o novo usuário já existe. Se não existir, o software adiciona o novo usuário ao software.

**Referências cruzadas:** R1

**Sequência típica:**:
| Administrador | Software |
| --- | --- |
| 1. O administrador executa o software | |
| 2. O administrador insere as credenciais do novo usuário. | 3. O software retorna a mensagem "Usuário adicionado com sucesso" |
| | 4. O software adiciona o novo usuário ao software. |

**Sequência alternativa:**: Linha 3. O software verifica se o usuário já existe. Se existir, o software retorna a mensagem "Usuário já existente".

## Caso de uso: Associar um secretário a um médico

**Ator:** Administrador ou Médico (iniciador da ação).

**Finalidade:** Permitir que um secretário seja associado a um médico.

**Tipo:** Secundário, essencial.

**Descrição:** Um administrador ou médico deseja associar um secretário a um médico. Ele informa o identificador médico e do secretário. O software associa o secretário ao médico.

**Referências cruzadas:** R9

**Sequência típica:**:
| Usuário (Administrador/Médico) | Software |
| --- | --- |
| 1. O usuário executa o software | |
| 2. O usuário informa o secretário e médico | 3. O software associa o secretário ao médico. |

**Sequência alternativa:**: Linha 3. O médico já possui um secretário associado. O software retorna a mensagem "Médico já possui um secretário associado".

## Caso de uso: Agendamento de uma consulta

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário agende uma consulta para um paciente.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja agendar uma consulta para um paciente. Ele informa o nome do paciente, o médico que irá atendê-lo e a data e horário da consulta. O software verifica se o médico está disponível na data e horário informados. Se estiver, o software agenda a consulta.

**Referências cruzadas:**: R2.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário insere o nome do paciente, o médico que irá atendê-lo e a data e horário da consulta. | 3. O software verifica se o médico está disponível na data e horário informados. |
| | 4. O software agenda a consulta. |

**Sequência alternativa:**:

- Linha 3. O software verifica se o médico está disponível na data e horário informados. Se não estiver, o software retorna a mensagem "Médico indisponível na data e horário informados".
- Linha 4. O software verifica se a data da consulta está entre 30 minutos e 60 dias a partir da data atual. Se não estiver, o software retorna a mensagem "Data da consulta inválida".

## Caso de uso: Cancelar uma consulta

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário cancele uma consulta.

**Tipo:** Primário, essencial.

**Descrição:**: O paciente deseja cancelar uma consulta. O secretário informa a consulta que será cancelada. O software cancela a consulta.

**Referências cruzadas:**: R7.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa a consulta que será cancelada. | 3. O software cancela a consulta. |

## Caso de uso: confirmar o comparecimento de um paciente

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário confirme o comparecimento de um paciente.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja confirmar o comparecimento de um paciente. Ele informa a consulta que será confirmada. O software confirma o comparecimento do paciente.

**Referências cruzadas:**: R3.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa a consulta que será confirmada. | 3. O software confirma o comparecimento do paciente. |

**Sequência alternativa:**: Linha 3. O software verifica se a consulta já foi realizada. Se já foi realizada, o software retorna a mensagem "Consulta já realizada".
**Sequência alternativa:**: Linha 3. O software verifica se a consulta está marcada para 7 dias a partir da data atual. Se não estiver, o software retorna a mensagem "Consulta não pode ser confirmada com menos de 7 dias de antecedência".

## Caso de uso: Notificar o secretário sobre uma consulta

**Ator:**: Software (iniciador da ação).

**Finalidade:**: Permitir que o software notifique o secretário sobre uma consulta.

**Tipo:** Secundário, essencial.

**Descrição:**: O software deve notificar o secretário sobre as próximas consultas. Ele verifica se ela já foi confirmada. Se não foi confirmada, o software notifica o secretário.

**Referências cruzadas:**: R4.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| | 2. O software automaticamente verifica se alguma consulta para o próxima dia útil não foi confirmada. |
| | 3. O software notifica o secretário sobre as consultas que não foram confirmadas. |

## Caso de uso: Verificar a agenda de um paciente

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um médico ou secretário verifique a agenda de um paciente.

**Tipo:** Primário, essencial.

**Descrição:**: O médico ou secretário deseja verificar a agenda de um paciente. Ele informa o nome do paciente. O software retorna a agenda do paciente.

**Referências cruzadas:**: R5.

**Sequência típica:**
| usuário (Secretário/Médico) | Software |
| --- | --- |
| 1. usuário executa o software | |
| 2. O usuário informa o nome do paciente. | 3. O software retorna a agenda do paciente. |

## Caso de uso: Verificar a agenda para um dia

**Ator:**: Secretário ou médico (iniciador da ação).

**Finalidade:**: Permitir que um médico ou secretário verifique a agenda para um dia.

**Tipo:** Primário, essencial.

**Descrição:**: O médico ou secretário deseja verificar a agenda para um dia. Ele informa a data. O software retorna a agenda para o dia.

**Referências cruzadas:**: R6.

**Sequência típica:**
| Usuário (Secretário/Médico) | Software |
| --- | --- |
| 1. Usuário executa o software | |
| 2. O usuário informa a data. | 3. O software retorna a agenda para o dia. |

## Caso de uso: Verificar a agenda de um médico

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário verifique a agenda de um médico.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja verificar a agenda de um médico. Ele informa o nome do médico. O software retorna a agenda do médico.

**Referências cruzadas:**: R8.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa o nome do médico. | 3. O software retorna a agenda do médico. |

**Sequência alternativa:**: Linha 3. O secretário não trabalha com o médico. O software retorna a mensagem "Médico não trabalha com o secretário".

## Caso de uso: Verificar o histórico de consultas de um médico

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário verifique o histórico de consultas de um médico nos possíveis intervalos de 1 mês, 3 meses ou 1 ano.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja verificar o histórico de consultas de um médico. Ele informa o nome do médico e o intervalo de tempo. O software retorna o histórico de consultas do médico no intervalo de tempo.

**Referências cruzadas:**: R11.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa o nome do médico. | 3. O software retorna o histórico de consultas do médico no intervalo de tempo. |

**Sequência alternativa:**: Linha 3. O secretário não trabalha com o médico. O software retorna a mensagem "Médico não trabalha com o secretário".

## Caso de uso: Verificar a lista de pacientes de um médico

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário verifique a listagem de pacientes de um médico nos possíveis intervalos de 1 mês, 3 meses ou 1 ano.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja verificar a listagem de pacientes de um médico. Ele informa o nome do médico e o intervalo de tempo. O software retorna a listagem de pacientes do médico no intervalo de tempo.

**Referências cruzadas:**: R12.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário informa o nome do médico. | 2. O software retorna a listagem de pacientes do médico no intervalo de tempo. |

**Sequência alternativa:**: Linha 2. O secretário não trabalha com o médico. O software retorna a mensagem "Médico não trabalha com o secretário".

## Caso de Uso: Receber o pagamento de uma consulta

**Ator**: Secretário (iniciador da ação).

**Finalidade**: Permitir que o secretário receba o pagamento de uma consulta.

**Tipo**: Primário, essencial.

**Descrição**: O secretário deseja receber o pagamento de uma consulta. Ele informa o valor da consulta, o nome do paciente e o tipo de pagamento (convênio ou particular). O software confirma o pagamento.

**Glossário**: Tipo de pagamento - convênio ou particular.

**Referências cruzadas**: R10.\*

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário informa o valor da consulta, o nome do paciente e o convênio. | 2. O software confirma o pagamento. |

**Sequência alternativa:** Linha 1: O secretário informa que o tipo de pagamento é particular. Ele informará o método de pagamento (cartão de crédito, débito ou PIX). O software confirma o pagamento.

## Caso de uso: agendar férias de um médico

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário agende férias de um médico.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja agendar as férias de um médico. Ele informa o nome do médico e a data de início e fim das férias, com no mínimo 60 dias de antecedência. O software agenda as férias do médico.

**Referências cruzadas:**: R14.1

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa o nome do médico e a data de início e fim das férias. | 3. O software agenda as férias do médico. |

**Sequência alternativa:**: Linha 3. O secretário informa a data de início e fim das férias com menos de 60 dias de antecedência. O software retorna um erro.
Linha 2. O médico não trabalha com o secretário. O software retorna um erro.

## Caso de uso: Adiar uma consulta

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário adie uma consulta.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja adiar uma consulta. Ele informa o nome do paciente e o horário atual (marcado) da consulta. Após isso, ele informa o novo horário para a consulta, seguindo as regras estabelecidas no caso de uso de agendamento de consultas. O software adia a consulta.

**Referências cruzadas:**: R13, R13.1, R14.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa o nome do paciente e o horário atual da consulta. | 3. O software retorna a consulta. |
| 4. O secretário informa o novo horário para a consulta. | 5. O software adia a consulta. |

**Sequência alternativa:**: Linha 4. O médico está de férias. O software retorna um erro.
Linha 4. O médico não trabalha com o secretário. O software retorna um erro.
Linha 4. O horário informado não está de acordo com as regras estabelecidas no caso de uso de agendamento de consultas. O software retorna um erro.

## Caso de uso: Registrar a ocorrência de uma consulta

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário registre a ocorrência de uma consulta: o horário que iniciou e finalizou a consulta.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja registrar a ocorrência de uma consulta. Ele informa o nome do paciente e o horário atual (marcado) da consulta. Após isso, ele informa o horário que iniciou e finalizou a consulta. O software registra a ocorrência da consulta.

**Referências cruzadas:**: R15.

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa o nome do paciente e o horário atual da consulta. | 3. O software retorna a consulta. |
| 4. O secretário informa o horário que iniciou e/ou finalizou a consulta. | 5. O software registra a ocorrência da consulta. |

**Sequência alternativa:**: Linha 4. O horário final informado é anterior ao horário inicial. O software retorna um erro.
Linha 2. O médico não trabalha com o secretário. O software retorna um erro.

## Caso de uso: Encaixar uma consulta

**Ator:**: Secretário (iniciador da ação).

**Finalidade:**: Permitir que um secretário encaixe uma consulta caso o médico não esteja atendendo.

**Tipo:** Primário, essencial.

**Descrição:**: O secretário deseja encaixar o horário de uma consulta. Ele informa o nome do paciente e o horário da consulta. o software verifica se o médico está atendendo. Caso não esteja, o software encaixa a consulta.

**Referências cruzadas:**: R15, R16.\*

**Sequência típica:**
| Secretário | Software |
| --- | --- |
| 1. O secretário executa o software | |
| 2. O secretário informa o nome do paciente e o horário que deseja inciar da consulta. | 3. O software verifica se o médico está atendendo. |
| 4. O médico não está atendendo. | 5. O software encaixa a consulta. |

**Sequência alternativa:**: Linha 4. O médico está atendendo, isto é, o paciente anterior ainda não saiu da consulta. O software retorna um erro.
Linha 2. O médico não trabalha com o secretário. O software retorna um erro.

**Observações:**: \* O encaixe só pode ocorrer caso o médico tenha finalizado a consulta anterior antes do horário previsto (está adiantado).
Neste caso de uso, a regra dos 30 minutos de antecedência não se aplica.
