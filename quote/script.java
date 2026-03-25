const quotes = [
  {
    text: "The best way to get started is to quit talking and begin doing.",
    author: "Walt Disney"
  },
  {
    text: "Success is not in what you have, but who you are.",
    author: "Bo Bennett"
  },
  {
    text: "Don’t let yesterday take up too much of today.",
    author: "Will Rogers"
  },
  {
    text: "If you can dream it, you can do it.",
    author: "Walt Disney"
  },
  {
    text: "Do what you can with all you have, wherever you are.",
    author: "Theodore Roosevelt"
  }
];

const quoteText = document.getElementById("quote");
const quoteAuthor = document.getElementById("author");
const newQuoteBtn = document.getElementById("new-quote");

function getRandomQuote() {
  const randomIndex = Math.floor(Math.random() * quotes.length);
  return quotes[randomIndex];
}

function displayQuote() {
  const quote = getRandomQuote();
  quoteText.textContent = `"${quote.text}"`;
  quoteAuthor.textContent = `- ${quote.author}`;
}

// Show quote on load
window.onload = displayQuote;

// New quote on button click
newQuoteBtn.addEventListener("click", displayQuote);