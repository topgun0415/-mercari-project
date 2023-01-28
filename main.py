from fastapi import FastAPI
from scraper import Scraper

app = FastAPI()
scraper = Scraper()

@app.get("/{word}")
async def search_google(word):
    return scraper.google_search(word)