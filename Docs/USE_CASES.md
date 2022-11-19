# Caso de uso: Autenticar um usuário.
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

# Caso de uso: Adicionar um novo usuário ao software.
**Ator:** Administrador (iniciador da ação).

**Finalidade:** Permitir que novos usuários sejam adicionados ao software.

**Tipo:** Secundário, essencial.

**Descrição:** Um administrador deseja adicionar um novo usuário ao software. Ele informa o nome de usuário, senha e categoria do novo usuário. O software verifica se o nome de usuário já existe. Se não existir, o software adiciona o novo usuário ao software.

**Referências cruzadas:** R1

**Sequência típica:**:
| Administrador | Software |
| --- | --- |
| 1. O administrador executa o software | |
| 2. O administrador insere o nome de usuário, senha e categoria do novo usuário. | 3. O software retorna a mensagem "Usuário adicionado com sucesso" |
| | 4. O software adiciona o novo usuário ao software. |

**Sequência alternativa:**: Linha 3. O software verifica se o nome de usuário já existe. Se existir, o software retorna a mensagem "Nome de usuário já existe".

# Caso de uso: Associar um secretário a um médico.
**Ator:** Administrador ou Médico (iniciador da ação).

**Finalidade:** Permitir que um secretário seja associado a um médico.

**Tipo:** Secundário, essencial.

**Descrição:** Um administrador ou médico deseja associar um secretário a um médico. Ele informa o nome de usuário do médico e do secretário. O software associa o secretário ao médico.

**Referências cruzadas:** R9

**Sequência típica:**:
| Usuário (Administrador/Médico) | Software |
| --- | --- |
| 1. O usuário executa o software | |
| 2. O usuário informa o secretário e médico | 3. O software associa o secretário ao médico. |

**Sequência alternativa:**: Linha 3. O médico já possui um secretário associado. O software retorna a mensagem "Médico já possui um secretário associado".

# Caso de uso: Agendamento de uma consulta.
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

# Caso de uso: Cancelar uma consulta.
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

# Caso de uso: confirmar o comparecimento de um paciente.
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

# Caso de uso: Notificar o secretário sobre uma consulta.
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

# Caso de uso: Verificar a agenda de um paciente.
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

# Caso de uso: Verificar a agenda para um dia.
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

# Caso de uso: Cancelar uma consulta.
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

# Caso de uso: Verificar a agenda de um médico.
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
