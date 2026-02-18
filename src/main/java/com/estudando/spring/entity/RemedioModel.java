package com.estudando.spring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.time.LocalDate;

@Getter // Gera os métodos getters para os campos da classe
@Setter // Gera os métodos setters para os campos da classe
@NoArgsConstructor // Gera um construtor sem argumentos
@AllArgsConstructor // Gera um construtor com argumentos para todos os campos da classe
@EqualsAndHashCode(of = "id") // Gera os métodos equals() e hashCode() baseados no campo 'id'
@Entity // Indica que esta classe é uma entidade JPA, ou seja, será mapeada para uma tabela no banco de dados
@Table(name = "Remedio") // Especifica o nome da tabela no banco de dados que esta entidade irá mapear
public class RemedioModel {

    @Id // Indica que o campo 'id' é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica a estratégia de geração automática do valor da chave primária
    private Long id;

    @NotBlank(message = "O nome do remédio é obrigatório") // Valida que o campo 'nome' não pode ser vazio ou nulo
    private String nome;

    @Enumerated(EnumType.STRING) // Especifica que o campo 'via' é um enum e deve ser armazenado como string no banco de dados
    @NotNull(message = "A via de administração do remédio é obrigatória") // Valida que o campo 'via' não pode ser nulo
    private Via via;

    @NotBlank(message = "O lote do remédio é obrigatório") // Valida que o campo 'lote' não pode ser vazio ou nulo
    private String lote;


    @NotNull (message = "A validade do remédio é obrigatória") // Valida que o campo 'validade' não pode ser nulo
    private LocalDate validade;

    @Min(value = 1, message = "A quantidade do remédio deve ser pelo menos 1") // Valida que o campo 'quantidade' deve ser no mínimo 1
    @NotNull(message = "A quantidade do remédio é obrigatória") // Valida que o campo 'quantidade' não pode ser nulo
    private Integer quantidade;

    @Enumerated(EnumType.STRING) // Especifica que o campo 'laboratorio' é um enum e deve ser armazenado como string no banco de dados
    @NotNull(message = "O laboratório do remédio é obrigatório") // Valida que o campo 'laboratorio' não pode ser nulo
    private Laboratorio laboratorio;

}
