package edu.knoldus.part2

/**
  * Created by Neelaksh on 17/7/17.
  */

object Pascal {

  def findPascal(column: Int, row: Int): Int = {

    def getPascalValue(col: Int, row: Int, value1: Int, value2: Int): Int = {

      if (col == 0)
        value1 / value2
      else
        getPascalValue(col - 1, row - 1, value1 * row, col * value2)
    }

    getPascalValue(column, row, 1, 1)
  }
}