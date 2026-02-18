CREATE TABLE remedio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    via VARCHAR(50) NOT NULL,
    lote VARCHAR(100) NOT NULL,
    validade DATE NOT NULL,
    quantidade INT NOT NULL,
    laboratorio VARCHAR(100) NOT NULL
);
