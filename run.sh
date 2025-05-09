#!/bin/bash

#python3 main.py --prompt "continue" --write 1 --modellist mc7 --nsamples 10 --codelist 13 16 17 18 19 20 24 25 27 29 30 31 32 33 35 36 38 40 44 46 47 48 49 50 52 54 58 61 62 64 65 66 67 68 71 72 73 75 76 79 81 82 83 86 87 88 90 94 103 105 106 107 69 92 101
#python3 main.py --prompt "continue" --write 1 --modellist ds7 --nsamples 10 --codelist 13 16 17 18 19 20 24 25 27 29 30 31 32 33 35 36 38 40 44 46 47 48 49 50 52 54 58 61 62 64 65 66 67 68 71 72 73 75 76 79 81 82 83 86 87 88 90 94 103 105 106 107 69 92 101
#python3 main.py --prompt "continue" --write 1 --modellist oc7 --nsamples 10 --codelist 13 16 17 18 19 20 24 25 27 29 30 31 32 33 35 36 38 40 44 46 47 48 49 50 52 54 58 61 62 64 65 66 67 68 71 72 73 75 76 79 81 82 83 86 87 88 90 94 103 105 106 107 69 92 101

#python3 main.py --prompt "continue" --write 1 --modellist mc7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228
#python3 main.py --prompt "continue" --write 1 --modellist ds7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228
#python3 main.py --prompt "continue" --write 1 --modellist oc7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228

#python3 main.py --prompt "enforce-fmt" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
#python3 main.py --prompt "enforce-fmt" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
#python3 main.py --prompt "enforce-fmt" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43

#python3 main.py --prompt "one-shot" --write 1 --modellist mc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
#python3 main.py --prompt "one-shot" --write 1 --modellist ds7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43
#python3 main.py --prompt "one-shot" --write 1 --modellist oc7 --nsamples 10 --codelist 2 5 6 7 8 9 10 11 12 69 23 28 101 43 109 92 37 14 43

#python3 main.py --prompt "one-shot-enf" --write 1 --modellist mc7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228
#python3 main.py --prompt "one-shot-enf" --write 1 --modellist ds7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228
#python3 main.py --prompt "one-shot-enf" --write 1 --modellist oc7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228

#python3 main.py --prompt "trivial" --write 1 --modellist mc7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228
#python3 main.py --prompt "trivial" --write 1 --modellist ds7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228
#python3 main.py --prompt "trivial" --write 1 --modellist oc7 --nsamples 10 --codelist 140 143 144 145 146 147 151 152 154 156 157 158 159 160 162 163 165 167 171 173 174 175 176 177 179 181 185 188 189 191 192 193 194 195 198 199 200 202 203 206 208 209 210 213 214 215 217 221 230 232 233 234 196 219 228

#python3 main.py --prompt "os-oldret" --write 1 --modellist mc7 --nsamples 10 --codelist {109..139}
#python3 main.py --prompt "os-oldret" --write 1 --modellist ds7 --nsamples 10 --codelist {109..139}
#python3 main.py --prompt "os-oldret" --write 1 --modellist oc7 --nsamples 10 --codelist {109..139}
#
#python3 main.py --prompt "os-oldret-enf" --write 1 --modellist mc7 --nsamples 10 --codelist {109..139}
#python3 main.py --prompt "os-oldret-enf" --write 1 --modellist ds7 --nsamples 10 --codelist {109..139}
#python3 main.py --prompt "os-oldret-enf" --write 1 --modellist oc7 --nsamples 10 --codelist {109..139}

# python3 main.py --prompt "3s-oldret-better-eg-enf" --write 1 --modellist ds7 --nsamples 10 --codelist {236..266}

# python nlassertiongenerator.py --write --modellist gpt4 --temp 0.5 --nsamples 1 --codelist {316..320}

python checker.py --codelist 245 --resultlist ./results/gpt-4/3s-oldret-better-eg --write 1 