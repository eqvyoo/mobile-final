curl -XPOST -S \
    -H "Accept: application/json" \
    -H 'Authorization: JWT bf45a9b4c4485a59eaae0d20c8522f60bd48da17' \
    -F 'title=제목' \
    -F 'text=API 내용' \
    -F 'created_date=2022-06-07T18:34:00+09:00' \
    -F 'published_date=2022-06-07T18:34:00+09:00' \
    -F '/Users/mac/Downloads/djangoenv/media/intruder_image/2023/06/13/intruder_image.png;type=image/jpg' \
