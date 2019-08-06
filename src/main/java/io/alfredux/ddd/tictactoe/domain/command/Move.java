package io.alfredux.ddd.tictactoe.domain.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Move {

    @TargetAggregateIdentifier
    UUID gameId;
    Integer column;
    Integer row;

}
