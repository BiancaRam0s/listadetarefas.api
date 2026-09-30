//caminho pacote
package br.com.curso.listadetarefas.api.tarefa;

//imports bibliotecas
import jakarta.persistence.*;
import lombok.Data;

//annotacions das springs
@Data
@Entity
@Table(name = "tb_tarefas")

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private boolean concluida;    
}
