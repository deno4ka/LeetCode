package com.deno4ka;

import com.deno4ka.Other.CompletableFutureExamples;
import com.deno4ka.Other.ParserFrontLog;
import com.deno4ka.Other.ParserLog;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsLast;
import static org.testng.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
//        FirstNonRepeatedCharacterInTheString firstNonRepeatedCharacterInTheString = new FirstNonRepeatedCharacterInTheString();
//        TACAssetExport tacAssetExport = new TACAssetExport();

//        Java8Puzzlers java8Puzzlers = new Java8Puzzlers();

//        _14_LongestCommonPrefix longestCommonPrefix = new _14_LongestCommonPrefix();
//        _21_MergeTwoSortedLists mergeTwoSortedLists = new _21_MergeTwoSortedLists();
//        _26_RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new _26_RemoveDuplicatesFromSortedArray();
//        _27_RemoveElement removeElement = new _27_RemoveElement();
//        _28_ImplementStrStr implementStrStr = new _28_ImplementStrStr();
//        _35_SearchInsertPosition searchInsertPosition = new _35_SearchInsertPosition();
//        _38_CountAndSay countAndSay = new _38_CountAndSay();
//        _53_MaximumSubarray maximumSubarray = new _53_MaximumSubarray();
//        _58_LengthOfLastWord lengthOfLastWord = new _58_LengthOfLastWord();
//        _66_PlusOne plusOne = new _66_PlusOne();
//        _67_AddBinary addBinary = new _67_AddBinary();
//        _69_SqrtX sqrtX = new _69_SqrtX();
//        _70_ClimbingStairs climbingStairs = new _70_ClimbingStairs();
//        _83_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new _83_RemoveDuplicatesFromSortedList();
//        _88_MergeSortedArray mergeSortedArray = new _88_MergeSortedArray();
//        _100_SameTree sameTree = new _100_SameTree();
//        _101_SymmetricTree symmetricTree = new _101_SymmetricTree();
//        _104_MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new _104_MaximumDepthOfBinaryTree();
//        _107_BinaryTreeLevelOrderTraversal2 binaryTreeLevelOrderTraversalIi = new _107_BinaryTreeLevelOrderTraversal2();
//        _108_ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new _108_ConvertSortedArrayToBinarySearchTree();
//        _110_BalancedBinaryTree balancedBinaryTree = new _110_BalancedBinaryTree();
//        _111_MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new _111_MinimumDepthOfBinaryTree();
//        _112_PathSum pathSum = new _112_PathSum();
//        _118_PascalsTriangle pascalsTriangle = new _118_PascalsTriangle();
//        _119_PascalsTriangle2 pascalsTriangle2 = new _119_PascalsTriangle2();
//        _121_BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new _121_BestTimeToBuyAndSellStock();
//        _122_BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new _122_BestTimeToBuyAndSellStock2();
//        _125_ValidPalindrome validPalindrome = new _125_ValidPalindrome();
//        _136_SingleNumber singleNumber = new _136_SingleNumber();
//        _141_LinkedListCycle linkedListCycle = new _141_LinkedListCycle();
//        _155_MinStack minStack = new _155_MinStack();
//        _160_IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new _160_IntersectionOfTwoLinkedLists();
//        _167_TwoSum2InputArrayIsSorted twoSum2InputArrayIsSorted = new _167_TwoSum2InputArrayIsSorted();
//        _168_ExcelSheetColumnTitle excelSheetColumnTitle = new _168_ExcelSheetColumnTitle();
//        _169_MajorityElement majorityElement = new _169_MajorityElement();
//        _171_ExcelSheetColumnNumber excelSheetColumnNumber = new _171_ExcelSheetColumnNumber();
//        _172_FactorialTrailingZeroes factorialTrailingZeroes = new _172_FactorialTrailingZeroes();
//        _189_RotateArray combineTwoTables = new _189_RotateArray();
//        _190_ReverseBits reverseBits = new _190_ReverseBits();
//        _191_NumberOf1Bits numberOf1Bits = new _191_NumberOf1Bits();
//        _198_HouseRobber houseRobber = new _198_HouseRobber();
//        _202_HappyNumber happyNumber = new _202_HappyNumber();
//        _203_RemoveLinkedListElements removeLinkedListElements = new _203_RemoveLinkedListElements();
//        _204_CountPrimes countPrimes = new _204_CountPrimes();
//        _205_IsomorphicStrings isomorphicStrings = new _205_IsomorphicStrings();
//        _206_ReverseLinkedList reverseLinkedList = new _206_ReverseLinkedList();
//        _217_ContainsDuplicate containsDuplicate = new _217_ContainsDuplicate();
//        _219_ContainsDuplicate2 containsDuplicate2 = new _219_ContainsDuplicate2();
//        _225_ImplementStackUsingQueues implementStackUsingQueues = new _225_ImplementStackUsingQueues();
//        _226_InvertBinaryTree invertBinaryTree = new _226_InvertBinaryTree();
//        _231_PowerOfTwo powerOfTwo = new _231_PowerOfTwo();
//        _232_ImplementQueueUsingStacks implementQueueUsingStacks = new _232_ImplementQueueUsingStacks();
//        _234_PalindromeLinkedList palindromeLinkedList = new _234_PalindromeLinkedList();
//        _235_LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree = new _235_LowestCommonAncestorOfABinarySearchTree();
//        _237_DeleteNodeInALinkedList deleteNodeInALinkedList = new _237_DeleteNodeInALinkedList();
//        _242_ValidAnagram validAnagram = new _242_ValidAnagram();
//        _257_BinaryTreePaths binaryTreePaths = new _257_BinaryTreePaths();
//        _258_AddDigits addDigits = new _258_AddDigits();
//        _263_UglyNumber uglyNumber = new _263_UglyNumber();
//        _268_MissingNumber missingNumber = new _268_MissingNumber();
//        _278_FirstBadVersion firstBadVersion = new _278_FirstBadVersion();
//        _283_MoveZeroes moveZeroes = new _283_MoveZeroes();
//        _290_WordPattern wordPattern = new _290_WordPattern();
//        _292_NimGame nimGame = new _292_NimGame();
//        _303_RangeSumQueryImmutable rangeSumQueryImmutable = new _303_RangeSumQueryImmutable();
//        _326_PowerOfThree powerOfThree = new _326_PowerOfThree();
//        _342_PowerOfFour powerOfFour = new _342_PowerOfFour();
//        _344_ReverseString reverseString = new _344_ReverseString();
//        _345_ReverseVowelsOfAString reverseVowelsOfAString = new _345_ReverseVowelsOfAString();
//        _349_IntersectionOfTwoArrays intersectionOfTwoArrays = new _349_IntersectionOfTwoArrays();
//        _350_IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new _350_IntersectionOfTwoArrays2();
//        _367_ValidPerfectSquare validPerfectSquare = new _367_ValidPerfectSquare();
//        _371_SumOfTwoIntegers sumOfTwoIntegers = new _371_SumOfTwoIntegers();
//        _374_GuessNumberHigherOrLower guessNumberHigherOrLower = new _374_GuessNumberHigherOrLower();
//        _383_RansomNote ransomNote = new _383_RansomNote();
//        _387_FirstUniqueCharacterInAString firstUniqueCharacterInAString = new _387_FirstUniqueCharacterInAString();
//        _389_FindTheDifference findTheDifference = new _389_FindTheDifference();
//        _400_NthDigit nthDigit = new _400_NthDigit();
//        _401_BinaryWatch binaryWatch = new _401_BinaryWatch();
//        _404_SumOfLeftLeaves sumOfLeftLeaves = new _404_SumOfLeftLeaves();
//        _405_ConvertANumberToHexadecimal convertANumberToHexadecimal = new _405_ConvertANumberToHexadecimal();
//        _409_LongestPalindrome longestPalindrome = new _409_LongestPalindrome();
//        _412_FizzBuzz fizzBuzz = new _412_FizzBuzz();
//        _414_ThirdMaximumNumber thirdMaximumNumber = new _414_ThirdMaximumNumber();
//        _415_AddStrings addStrings = new _415_AddStrings();
//        _427_ConstructQuadTree constructQuadTree = new _427_ConstructQuadTree();
//        _429_NAryTreeLevelOrderTraversal nAryTreeLevelOrderTraversal = new _429_NAryTreeLevelOrderTraversal();
//        _434_NumberOfSegmentsInAString numberOfSegmentsInAString = new _434_NumberOfSegmentsInAString();
//        _437_PathSum3 pathSum3 = new _437_PathSum3();
//        _438_FindAllAnagramsInAString findAllAnagramsInAString = new _438_FindAllAnagramsInAString();
//        _441_ArrangingCoins arrangingCoins = new _441_ArrangingCoins();
//        _443_StringCompression stringCompression = new _443_StringCompression();
//        _447_NumberOfBoomerangs numberOfBoomerangs = new _447_NumberOfBoomerangs();
//        _448_FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new _448_FindAllNumbersDisappearedInAnArray();
//        _453_MinimumMovesToEqualArrayElements minimumMovesToEqualArrayElements = new _453_MinimumMovesToEqualArrayElements();
//        _455_AssignCookies assignCookies = new _455_AssignCookies();
//        _458_PoorPigs poorPigs = new _458_PoorPigs();
//        CompletableFutureExamples cfe = new CompletableFutureExamples();
//        cfe.main(null);
        CompletableFutureExamples.main(null);

//        List<Object> objects = Collections.emptyList();
//        objects.add(null);

    }



}
