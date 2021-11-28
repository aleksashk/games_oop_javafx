package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.C8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure bishopBlackC8A6 = bishopBlack.copy(Cell.A6);
        Cell expected = bishopBlackC8A6.position();
        Cell actual = Cell.A6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void way() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] actual = bishopBlack.way(Cell.G5);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayFail() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.D6);
    }
}