package fei.upce.appsource.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
public class SourceData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column()
    @Getter @Setter private String param1;

    @Column()
    @Getter @Setter private int param2;

    @Column()
    @Getter @Setter private long param3;

    @Column(nullable=false)
    @Getter @Setter private String param4;

    @Column(unique=true, nullable=false)
    @Getter @Setter private String param5;

    @Column()
    @Getter @Setter private int param6;

    @Column(nullable=false)
    @Getter @Setter private String param7;

    @Column()
    @Getter @Setter private String param8;

    @Column()
    @Getter @Setter private int param9;

    @Column()
    @Getter @Setter private String param10;

    @Column()
    @Getter @Setter private long param11;

    @Column()
    @Getter @Setter private String param12;
}
